//Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
int[] array(int size)
{
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = new Random().Next(100, 1000);
    }
    return arr;
}
int[] reserved(int[] array)
{

    int A = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] % 2 == 0)
        {
            A++;
        }
    }
    int[] sums = { A };
    return sums;
}
Console.WriteLine("Введите разрядность массива ");
int size = int.Parse(Console.ReadLine());
int[] mass = array(size);
Console.WriteLine($"[{String.Join(", ", mass)}]");
Console.WriteLine($" Четных чисел в массиве {String.Join(", ", reserved(mass))}");
