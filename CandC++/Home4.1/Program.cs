//Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.



Console.WriteLine("Введите A: ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Введите B: ");
int b = int.Parse(Console.ReadLine());
if (b<0) {
    Console.Write("Число B дложно быть меньше 0 ");
    return;
}
int gg(int a ,int b) {
    int sum = 1;
    for(int i = 0; i < b; i++){
    sum = sum * a;
    }
return sum;
}
Console.Write($"Число {a} в степени {b} равно {gg(a , b)}");