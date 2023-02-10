Console.WriteLine("Введите Число A ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Введите Число B ");
int b = int.Parse(Console.ReadLine());
Console.WriteLine("Введите Число С ");
int c = int.Parse(Console.ReadLine());
int max = 0;
if (a>b) {
max = a; 
}
else {
max = b;
}
if (c>max) {
max = c;
}
Console.WriteLine("Ответ Макс: " + max );