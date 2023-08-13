//Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями 
//y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

Console.Write("Введите A: ");
var A = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите B: ");
var B = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите A1: ");
var A1 = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите B1: ");
var B1 = Convert.ToDouble(Console.ReadLine());
 
var x = -(B - B1) / (A - A1);
var y = A * x + B;
Console.WriteLine($"Пересечение в точке: ( {x} ;{y} )");
