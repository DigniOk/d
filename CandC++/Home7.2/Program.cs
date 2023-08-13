// //Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает 
// //значение этого элемента или же указание, что такого элемента нет.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// Console.WriteLine("Введите строку");
// int a = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите столбец");
// int b = int.Parse(Console.ReadLine());
// Console.WriteLine();
// Сhislo(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// int[,] Сhislo(int[,] array)
// {
//     if (a < array.GetLength(0) && b < array.GetLength(1))
//     {
//         Console.WriteLine($"Число {array[a, b]}");
//     }
//     else
//     {
//         Console.WriteLine($"{a} {b} -> такого индекса в массиве нет");
//     }
//     return array;
// }

