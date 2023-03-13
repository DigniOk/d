//Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

Console.WriteLine("Ввелите количество строк массива");
int rows = int.Parse(Console.ReadLine());
Console.WriteLine("Ввелите количество столбцов массива");
int columns = int.Parse(Console.ReadLine());
int[,] array = GetArray(rows, columns, 0, 10);
PrintArray(array);
SumMinLine(array);
int[,] GetArray(int m, int n, int minValue, int maxValue)
{
    int[,] result = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return result;
}
void PrintArray(int[,] inArray)
{
    for (int i = 0; i < inArray.GetLength(0); i++)
    {
        for (int j = 0; j < inArray.GetLength(1); j++)
        {
            Console.Write($" {inArray[i, j]} ");
        }
        Console.WriteLine();
    }
}
int[,] SumMinLine(int[,] array)
{
    int min = 0;
    int minSum = 0;
    int sum = 0;
    for (int i = 0; i < array.GetLength(1); i++)
    {
        min = min + array[0, i];
    }
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++) 
        {
            sum = sum + array[i, j];
        }
        Console.WriteLine();
        Console.Write($" {sum} ");
        if (sum < min)
        {
            min = sum;
            minSum = i;
        }
        sum= 0;
    }
   
    Console.WriteLine();
    Console.WriteLine();
    Console.Write($"{minSum + 1} строка");
    return array;
}
