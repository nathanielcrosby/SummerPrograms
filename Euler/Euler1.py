#First Euler Problem
#Solving for sum of all multiples of 3 or 5 below 1000
#Answer is 233168
value = 0

for i in range(1000):
    if (i % 3 == 0):
        value += i
    elif (i % 5 == 0):
        value += i

print(value)

