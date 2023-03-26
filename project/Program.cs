//Написать программу которая из имеющегося массива строк длина которых меньше или равна 3 символа
Console.Write("Введите число или слово через запятую: ");
string[] TextArray = Console.ReadLine().Split(',');
string[] NewTextArray = new string[TextArray.Length];
void ArraySearch(string[] TextArray, string[] NewTextArray)
{
    int count = 0;
    for (int i = 0; i < TextArray.Length; i++)
    {
    if(TextArray[i].Length <= 3)
        {
        NewTextArray[count] = TextArray[i];
        count = count + 1;
        }
    }
}
void PrintArray(string[] array)
{
    for (int i = 0; i < array.Length; i++)
    {   
        Console.Write($"{array[i]}");
    }
    Console.WriteLine();
}
ArraySearch(TextArray, NewTextArray);
Console.Write("Массив из строк длина которых <=3 символа: ");
PrintArray(NewTextArray);