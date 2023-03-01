//Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

int[] array(int size)
{
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = new Random().Next(-10, 10);
    }
    return arr;
}
int[] reserved(int[] array)
{

    int A = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (i % 2 == 1)
        {
            A = A + array[i];
        }
    }
    int[] sums = { A };
    return sums;
}
Console.WriteLine("Введите разрядность массива ");
int size = int.Parse(Console.ReadLine());
int[] mass = array(size);
Console.WriteLine($"[{String.Join(", ", mass)}]");
Console.WriteLine($" Сумма нечетных индексов {String.Join(", ", reserved(mass))}");
