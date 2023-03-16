//Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.

Console.WriteLine("Введите Число");
int a = int.Parse(Console.ReadLine());
string Number(int a)
{
    if (a >= 1)
    {
        return $"{a} " + Number(a - 1);
    }
    else
    {
        return String.Empty;
    }
}
Console.WriteLine(Number(a));