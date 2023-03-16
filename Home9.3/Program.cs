//Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n

Console.WriteLine("Введите начальное число A:");
int m = int.Parse(Console.ReadLine());
Console.WriteLine("Введите начальное число B:");
int n = int.Parse(Console.ReadLine());

int Function(int m, int n)
{
    if (m == 0)
    {
        return n + 1;
    }
    if (m != 0 && n == 0)
    {
        return Function(m - 1, 1);
    }
    if (m > 0 && n > 0)
    {
        return Function(m - 1, Function(m, n - 1));
    }
    return Function(m, n);
}

Console.WriteLine($"Функция Аккермана для чисел A({m},{n}) = {Function(m, n)}");