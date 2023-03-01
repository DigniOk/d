//Задайте массив целых чисел. Найдите разницу между максимальным и минимальным элементов массива.

int[] array(int size)
{
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
    {
        arr[i] = new Random().Next(-10, 11);
    }
    return arr;
}
int[] reserved(int[] array)
{

    int max = array[0];
    int min = array[0];
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > max) {
        max = array[i];
        }
        
        if (array[i] < min) {
            min = array[i];
        }
    }
    if (min < 0) {
        min = min * -1;
    }
    int[] sums = { max - min};
    
    return sums;
}
Console.WriteLine("Введите разрядность массива ");
int size = int.Parse(Console.ReadLine());
int[] mass = array(size);
Console.WriteLine($"[{String.Join(", ", mass)}]");
Console.WriteLine($" Разница между максимальным элементом и минимальным равна {String.Join(", ", reserved(mass))}");
