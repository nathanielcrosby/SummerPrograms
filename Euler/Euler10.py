total = 2
num = 2

while(num < 2000000):
    num+=1
    for i in range(2, num):
        if((num % i) == 0):
            bool = False
            break
        else:
            bool = True

    if (bool):
        total += num

print(total)
        
