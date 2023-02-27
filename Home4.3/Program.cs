//Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.

int[] GetBinaryArray(int size){
    int[] result = new int[size];
    for (int i = 0; i < size; i++){
        result[i] = new Random().Next(10, 51);
    }
    return result;
}
int[] array = GetBinaryArray(8);
Console.WriteLine($"[  {String.Join(",   ", array)}  ]");
