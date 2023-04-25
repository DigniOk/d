# Задача 24: В фермерском хозяйстве в Карелии выращивают чернику. Она растёт на круглой грядке, причём кусты высажены только по окружности. 
# Таким образом, у каждого куста есть ровно два соседних. Всего на грядке растёт N кустов.
# Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них выросло различное число ягод — на i-ом кусте выросло ai ягод.
# В этом фермерском хозяйстве внедрена система автоматического сбора черники. Эта система состоит из управляющего модуля и нескольких собирающих модулей. 
# Собирающий модуль за один заход, находясь непосредственно перед некоторым кустом, собирает ягоды с этого куста и с двух соседних с ним.
# Напишите программу для нахождения максимального числа ягод, которое может собрать за один заход собирающий модуль,
# находясь перед некоторым кустом заданной во входном файле грядки.

import random 
rand_list=[]
A = int(input("Введите число кустов на на грядке: "))
for i in range(A):
     rand_list.append(random.randint(0 , 20))
print(rand_list)
X = int(input('Введите номер куста: '))
berries = 0
if X == 1:
    berries = rand_list[0] + rand_list[1] + rand_list[-1]
elif X == len(rand_list):
     berries = rand_list[-2] + rand_list[-1] + rand_list[0]
else:
     berries = rand_list[X-1] + rand_list[X-2] + rand_list[X]
print(f"Собрано {berries} ягод")