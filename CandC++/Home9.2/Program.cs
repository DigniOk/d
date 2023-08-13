//Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

Console.WriteLine("Введите Число A");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Введите Число B");
int b = int.Parse(Console.ReadLine());
int Sum(int a , int b)
{
    if (a <= b)
    {
         return a + Sum(a + 1, b);
    }
    else
    {
       return 0;
    }
}

Console.WriteLine($"Сумма элементов {Sum(a, b)}");