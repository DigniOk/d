# Задача 16: Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N]. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве.
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

import random 
rand_list=[]
A = int(input("Ввести число эл: "))
k = int(input("Введите цифру: "))
count = 0
rand_list.append(random.randint(1 , 10))
for i in range(A):
    rand_list.append(random.randint(1 , 10))
    if rand_list[i] == k:
        count = count + 1
print(rand_list)
print(f"Число {k} встречается в массиве {count} раз")