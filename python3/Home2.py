# Задача 18: Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X.
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве.
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

import random 
rand_list=[]
A = int(input("Ввести число эл: "))
k = int(input("Введите цифру: "))
for i in range(A):
    rand_list.append(random.randint(1 , 20))
print(rand_list)
index = 0
min = abs(k - rand_list[0])
for i in range(1, A):
    ele = abs(k - rand_list[i])
    if ele < min:
        min = ele
        index = i
print(f"Близкий по величине элемент к числу {k} : {rand_list[index]}")