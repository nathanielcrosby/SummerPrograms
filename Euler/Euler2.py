#Second Euler Problem
#Finding sum of all fibonacci numbers less that 4 million
#Answer is 4613732

fib = 1
prev1 = 1
prev2 = 1
fib_sum = 0

while (fib < 4000000):
    if (fib%2 == 0):
        fib_sum += fib   
    
    prev2 = prev1
    prev1 = fib
    fib += prev2
    
print(fib_sum)
