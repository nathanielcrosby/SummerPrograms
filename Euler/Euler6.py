#Euler Problem 6
#Find the difference between the sum ofthe squares of the first one
#hundred natural numbers and the square of the sum
#Answer: 25164150

sum_squares = 0
square_sum = 0
total = 0;

for i in range (1,101):
    total += i
    sum_squares += i*i

square_sum = total * total

print(square_sum - sum_squares)
