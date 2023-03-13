//Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно 
//выводить массив, добавляя индексы каждого элемента. Массив размером 2 x 2 x 2
int[,,] array = new int[2, 2, 2];
FillArray(array);
PrintIndex(array);

void PrintIndex(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.WriteLine();
            for (int k = 0; k < array.GetLength(2); k++)
            {
                Console.Write($"{array[i, j, k]}({i},{j},{k}) ");
            }
        }
    }
}

void FillArray(int[,,] array)
{
    int count = 11;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(2); k++)
            {
                array[k, i, j] = array[k, i, j] + count;
                count = count + 2;
            }
        }
    }
}