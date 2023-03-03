//Написать программу Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
Console.WriteLine("Введите числа");
int[] values = Array.ConvertAll < string, int >( Console.ReadLine().Split(new char[] {' ', ','}, StringSplitOptions.RemoveEmptyEntries), x=> int.Parse(x) );
Console.WriteLine($"Положительных чисел: {String.Join(" ", ggg(values))} ");
int[] ggg(int[] inArray)
{
    int b = 0;
    for (int i = 0; i < inArray.Length; i++) 
    {
        if (inArray[i] > 0) {
        b = b + 1;
        }
    }
   int[] sums = { b };
   return sums;
}