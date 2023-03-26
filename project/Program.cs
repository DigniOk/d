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