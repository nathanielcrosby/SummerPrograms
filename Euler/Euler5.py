#Euler Problem 5
#Finding the smallest number evenly divisible by 1-20
#Answer: 232792560

num = 20

def isDivisible(num):
    if ((num % 1 == 0) & (num % 2 == 0) & (num % 3 == 0) & (num % 4 == 0) & (num % 5 == 0) &
        (num % 6 == 0) & (num % 7 == 0) & (num % 8 == 0) & (num % 19 == 0) & (num % 10 == 0) &
        (num % 11 == 0) & (num % 12 == 0) & (num % 13 == 0) & (num % 14 == 0) & (num % 15 == 0) &
        (num % 16 == 0) & (num % 17 == 0) & (num % 18 == 0) & (num % 19 == 0) & (num % 20 == 0)):
        return True;
    return False;

while(True):
    if (isDivisible(num)):
        break
    num+=20

print(num)
