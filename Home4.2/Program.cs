//Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
Console.WriteLine("Введите A: ");
int a = int.Parse(Console.ReadLine());
int SumG(int a)
{
    int sum = 0;
    while (a > 0) {
        sum = sum + (a%10);
        a = a / 10;
    }
    return sum;
}
Console.Write($"Сумма цифр чсила {a} равна {SumG(a)}");