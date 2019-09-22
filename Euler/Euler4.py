#Euler Problem 4
#Finding the largest palindrome that is a product of 2 three digit numbers
#The answer is 906609

largest=-1

def isPalindrome(num):
    val = str(num)
    temp = ""
    for i in val:
        temp = i + temp
    if(val == temp):
        return True
    return False

for i in range(100, 1000):
    for j in range(i, 1000):
        num = i*j
        if(isPalindrome(num) & (num > largest)):
            largest = num

print(largest)
