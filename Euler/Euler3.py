lpf = 2
num = 600851475143;
bool = False

for x in range(1,num):
    if (num % x == 0):
        for i in range(2, int(num/x)):
            if (((num/x) % i) == 0):
                bool = False
                break
            else:
                bool = True
        
        if (bool):
            lpf = num/x
            print(lpf)
            break


    
