//Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

Console.WriteLine("Ввелите количество строк массива");
int rows = int.Parse(Console.ReadLine());
Console.WriteLine("Ввелите количество столбцов массива");
int columns = int.Parse(Console.ReadLine());
int[,] array = GetArray(rows, columns, 0, 10);
int[,] array2 = GetArray(rows, columns, 0, 10);
int[,] array3 = GetArray(rows, columns, 0, 0);
PrintArray(array);
Console.WriteLine();
PrintArray(array2);
MultiplyMatrix(array, array2, array3);
Console.WriteLine($"Произведение первой и второй матриц:");
PrintArray(array3);
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
void MultiplyMatrix(int[,] array, int[,] array2, int[,] array3)
{
  for (int i = 0; i < array3.GetLength(0); i++)
  {
    for (int j = 0; j < array3.GetLength(1); j++)
    {
      int sum = 0;
      for (int k = 0; k < array.GetLength(1); k++)
      {
        sum = sum + array[i,k] * array2[k,j];
      }
      array3[i,j] = sum;
    }
  }
}