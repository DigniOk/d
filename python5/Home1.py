# Напишите программу, которая на вход принимает два числа A и B,
# и возводит число А в целую степень B с помощью рекурсии.

A = int(input("Введите число: "))
B = int(input("Введите степень числа: "))
def numb(A , B):
    sum = 1
    if B == 0:
        return 1
    else:
        return A * numb(A , B - 1)
print(f"Число {A} в стпени {B} равно {numb(A,B)}")
