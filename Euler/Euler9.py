#Euler problem 9
#Find product of Pythagorean triple equalling 1000
#Answer: 31875000

def find_triplet(n):
    for i in range(1,n):
        for j in range(1,n-i):
            k = 1000 - i - j
            if ((i*i + j*j) == k*k):
                return i*j*k

print(find_triplet(1000))
