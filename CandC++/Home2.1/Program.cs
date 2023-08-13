int a, b, count;
int Numberb(int number)
{
    count = 0;
    while (number > 0)
    {
        number = number / 10;
        count++;
    }
 
    return count;
    
}
Console.WriteLine("Введите Число A ");
a = Convert.ToInt32(Console.ReadLine());
b = Numberb(a);
if (b <= 2)
{
    Console.WriteLine("третьей цифры нет");
}
else
{
    if (b > 3)
    {
        a = a / Convert.ToInt32(Math.Pow(10, b - 3));
    }
    a = a % 10;
    Console.WriteLine("Третья цифра введённого числа: " + a);
}
