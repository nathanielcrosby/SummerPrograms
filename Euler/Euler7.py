#Euler problem 7
#Find the 10,001 prime number
#Answer is 104743

prime_counter = 1
num = 2
bool = False

while(True):
    num+=1
    for i in range(2, num):
        if((num % i) == 0):
            bool = False
            break
        else:
            bool = True

    if (bool):
        prime_counter+=1
        if(prime_counter == 10001):
            break

print (num)
