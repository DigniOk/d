//Console.WriteLine("Введите Числа A ");
//int Value = int.Parse(Console.ReadLine());
//int sum = Value*Value;
//Console.WriteLine("Квадрат числа A равен: " + sum);

//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите Число B ");
//int b = int.Parse(Console.ReadLine());
//int max = 0;
//int min = 0;
//if (a>b) {
//max = a; min = b;
//}
//else {
//max = b; min = a;
//}
//Console.WriteLine("Ответ Макс: " + max + " Ответ Мин: " + min);


//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//int b = -a;
//Console.Write(b + ",");
//while (a > b)
//{
//   b = b + 1;
//   Console.Write(b + ",");
//}

//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите Число B ");
//int b = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите Число С ");
//int c = int.Parse(Console.ReadLine());
//int max = 0;
//if (a>b) {
//max = a; 
//}
//else {
//max = b;
//}
//if (c>max) {
//max = c;
//}
//Console.WriteLine("Ответ Макс: " + max );

//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//if (a % 2 == 1){
//Console.WriteLine("Нечетное число") ;
//}
//else {
//Console.WriteLine("Четное число" );
//}

//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//int b = 1;
//while (b<a) { 
//if ( b % 2 == 1) {
//}
//else {
//     Console.WriteLine("Ответ : " + b );
//}
//b = b + 1;

//}

//int a1 = 15;
//int b1 = 21;
//int c1 = 39;
//int a2 = 12;
//int b2 = 23;
//int c2 = 33;
//int a3 = 13;
//int b3 = 23;
//int c3 = 33;

//int max = a1;
//if (b1 > max) max = b1;
//if (c1 > max) max = c1;
//if (a2 > max) max = a2;
//if (b2 > max) max = b2;
//if (c2 > max) max = c2;
//if (a3 > max) max = a3;
//if (b3 > max) max = b3;
//if (c3 > max) max = c3;
//Console.WriteLine(max);

//int Max(int arg1, int arg2, int arg3)
//{
//int result = arg1;
//if (arg2 > result) result = arg2;
//if (arg3 > result) result = arg3;
//return result;
//}
//int a1 = 15;
//int b1 = 21;
//int c1 = 1500;
//int a2 = 12;
//int b2 = 23;
//int c2 = 33;
//int a3 = 13;
//int b3 = 23;
//int c3 = 33;

//int max1 = Max(a1, b1, c1);
//int max2 = Max(a2, b2, c2);
//int max3 = Max(a3, b3, c3);
//int max  = Max(max1, max2, max3);
//Console.WriteLine(max);


//int Max(int arg1, int arg2, int arg3)
//{
//int result = arg1;
//if (arg2 > result) result = arg2;
//if (arg3 > result) result = arg3;
//return result;
//}
//int [] array = {11,21,31,41,15,61,17,18,19};

//int max = Max (
//Max(array[0], array[1], array[2]),
//Max(array[3], array[4], array[5]),
//Max(array[6], array[7], array[8])
//);
//Console.WriteLine(max);

// int[] array = { 1, 12, 31, 4, 15, 16, 17, 18 };
// int n = array.Length;
// int find = 4;
// int index = 0;
// while (index < n)
// {
//     if (array[index] == find)
//     {
//         Console.WriteLine(index);
//     }
//     index = index + 1; //index ++;

// }

// void FillArray(int[] collection)
// {
// int length = collection.Length;
// int index = 0;
// while (index < length)
// {
// index = index + 1;
// index++;
// }



//int[] array = new int[10];

//int num = new Random().Next(100, 1000);
//Console.WriteLine("Наше Число: " + num);
//int second = num%100/10;
//Console.WriteLine(second);


//Console.WriteLine("Введите Число A ");
//int a = int.Parse(Console.ReadLine());
//int second = (a / 100) * 10 + (a % 10);
//Console.WriteLine(second);


//int num = new Random().Next(100, 1000);
//Console.WriteLine("Наше Число: " + num);
//int second = (num / 100) * 10 + (num % 10);
//Console.WriteLine(second);


//int num = new Random().Next(1, 8);
//Console.WriteLine("Наше Число: " + num);
//if (num>5)
//Console.WriteLine("Выходной");
//else
//Console.WriteLine("Будни");


//int a, b, count;
//int Numberb(int number)
//{
//count = 0;
//while (number > 0)
//{
//number = number / 10;
//count++;
//}

//return count;

//}
//Console.WriteLine("Введите Число A ");
//a = int.Parse(Console.ReadLine());
//b = Numberb(a);
//if (b <= 2)
//{
//Console.WriteLine("третьей цифры нет");
//}
//else
//{
//if (b > 3)
//{
//a = a / Convert.ToInt32(Math.Pow(10, b - 4));
//}
//a = a % 10;
//Console.WriteLine("Третья цифра введённого числа: " + a);
//}


//Console.WriteLine("Введите X: ");
//int X = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите Y: ");
//int Y = int.Parse(Console.ReadLine());
//if (X > 0 && Y > 0) {
//Console.WriteLine("1");
//}if (X < 0 && Y > 0) {
//Console.WriteLine("2");
//}else if (X < 0 && Y < 0){
//Console.WriteLine("3");
//}else if (X > 0 && Y < 0){
//Console.WriteLine("4");
//}else if (X == 0 || Y == 0){
//Console.WriteLine("На оси");
//}


//Console.WriteLine("Введите P: ");
//int P = int.Parse(Console.ReadLine());
//if (P == 1){
//Console.WriteLine("X > 0 , Y > 0");
//}if (P == 2) {
//Console.WriteLine("X < 0 , Y > 0");
//}else if(P == 3) {
//Console.WriteLine("X < 0 , Y < 0");
//}else if (P == 4) {
//Console.WriteLine("X > 0 , Y < 0");
//}else {
//Console.WriteLine("Введена не правильная четверть");
//}


//Console.WriteLine("Введите X: ");
//double X = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Y: ");
//double Y = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите X2: ");
//double X2 = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Y2: ");
//double Y2 = double.Parse(Console.ReadLine());
//double s = Math.Sqrt((X - X2)*(X - X2) + (Y - Y2)*(Y - Y2));
//Console.WriteLine(s);


// Console.WriteLine("Введите X: ");
// int x = int.Parse(Console.ReadLine());
// int[] result = new int[x];
// for(int i = 1; i <= x; i++)
// result[i-1] = i * i;
// for(int i = 0; i < x; i++)
// Console.WriteLine(result[i]);


//Console.WriteLine("Введите X: ");
//int x = int.Parse(Console.ReadLine());
//int i = 1;
//int n = x;
//if (x < 0) {
//i = x;
//n = -x;
//x = -1;
//}
//int[] result = new int[n];
//int j = 0;
//for(; i<=x;i++){
//result[j] = i * i;
//j++;
//}
//for(j=0; j < n; j++) {
//Console.WriteLine(result[j]);
//}



//Console.WriteLine("Введите X: ");
//string x = Console.ReadLine();
//if (x.Length<5 || x.Length>5)  {
//Console.WriteLine("Число не пятизначное");
//return;
//}
//if (x[0] == x[4] && x[1] == x[3]) {
//Console.WriteLine("Число палидром");
///}
//else {
//Console.WriteLine("Число не палидром");
//}


//Console.WriteLine("Введите X: ");
//double X = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Y: ");
//double Y = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Z: ");
//double Z = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите X2: ");
//double X2 = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Y2: ");
//double Y2 = double.Parse(Console.ReadLine());
//Console.WriteLine("Введите Z2: ");
//double Z2 = double.Parse(Console.ReadLine());
//double s = Math.Sqrt((X - X2)*(X - X2) + (Y - Y2)*(Y - Y2) + (Z - Z2)*(Z - Z2));
//Console.WriteLine($"s = {s:f2}");



//  Console.WriteLine("Введите X: ");
// int x = int.Parse(Console.ReadLine());
// int i = 1;
// int n = x;
// if (x < 0)
// {
//     i = x;
//     n = -x;
//     x = -1;
// }
// int[] result = new int[n];
// int j = 0;
// for (; i <= x; i++)
// {
//     result[j] = i * i * i;
//     if (result[j] < 0)
//     {
//         result[j] = result[j] * (-1);
//     }
//     j++;
// }
// for (j = 0; j < n; j++)
// {
//     Console.WriteLine(result[j]);
// }


//for(int i = 2; i < 10;i ++)
//{
//for(int j = 1; j <= 10; j++)
//{
//Console.WriteLine($"{i} x {j} = {i * j} ");
//}
//}

//string text = "— Я думаю, — сказал князь, улыбаясь, — что,"
//+ "ежели бы вас послали вместо нашего милого Винценгероде,"
//+ "вы бы взяли приступом согласие прусского короля."
//+ "Вы так красноречивы. Вы дадите мне чаю?";
//string Replace(string text, char oldValue, char newValue)
//{
//string result = String.Empty;
//int length = text.Length;
//for (int i = 1; i < length; i++)
//{
// if(text[i] == oldValue)
//result = result + $"{newValue}";

//else  result = result + $"{text[i]}";
//}
//return result;
//}
//string newText = Replace(text, ' ', '|');
//Console.WriteLine(newText);
//Console.WriteLine();
//newText = Replace(newText, 'к', 'К');
//Console.WriteLine(newText);

//int[] arr = { 1, 5, 4, 3, 2, 6, 7, 1, 1 };
//void PrintArray(int[] array)
//{
//int count = array.Length;
//for (int i = 0; i < count; i++)
//{
//Console.Write($" {array[i]}");
//}
//Console.WriteLine();
//}
//void SelectionSort(int[] array)
//{
//for (int i = 0; i < array.Length - 1; i++)
//{
//int minPosition = i;
//for (int j = i + 1; j < array.Length; j++)
//{
//if (array[j] < array[minPosition])
//{
//minPosition = j;
//}
//}
//int temporary = array[i];
//array[i] = array[minPosition];
//array[minPosition] = temporary;
//}
//}

//PrintArray(arr);
//SelectionSort(arr);
//PrintArray(arr);


//Написать программу котрая принимает на вход число A и выдает сумму от 1 до A 
//A = 5
//sum = 1 + 2 + 3 + 4 + 5

// int GetSum(int n) {
//     int sum = 0;
//     for (int i = 1; i <= n; i++)
//         sum += i; // sum = sum + i
//     return sum;
// }
// Console.WriteLine("Введите X: ");
// int n = int.Parse(Console.ReadLine());
// Console.WriteLine($"Сумма от 1 до {n} равна {GetSum(n)}");

//Написать программу, которая принимает на вход число и выдает количество цифр в числе.
//456 --> 3
//Первый вариант

// int LenSum(int n)
// {
//     int a = (int)Math.Log10(n) + 1;
//     return a;
// }
// Console.WriteLine("Введите X: ");
// int n = int.Parse(Console.ReadLine());
// Console.WriteLine($"Количество чисел {n} равна {LenSum(n)}");

//Второй вариант
// Console.WriteLine("Введите X: ");
// int n = int.Parse(Console.ReadLine());
// Console.WriteLine($"Количество чисел {n} равна {LenSum(n)}");
// int LenSum(int n){
//     int count = 0;
//     if (n < 0) {
//         n = n * (-1);
//     }
//     while ( n > 0) {
//         n = n / 10;
//         count ++;
//     }
//     return count;
// }

//Написать программу котрая принимает на вход число A и выдает произведение чисел от 1 до A 
//A = 5
//sum = 1 * 2 * 3 * 4 * 5 // 120


// Console.WriteLine("Введите X: ");
// int n = int.Parse(Console.ReadLine());
// Console.WriteLine($"Произведение чисел {n} равна {LenSum(n)}");
// int LenSum(int n)
// {
//     int sum = 1;
//     int i = 2;
//     if (n<0) {
//         i = n;
//         n = -1;
//     }
//     for (; i <= n; i++) {
//         sum = sum * i;
//         Console.WriteLine(sum);
//     }
//     return sum;
// }

//Написать программу которая выводит массив  из 8 элементов, заполненый 0 и 1 в случайном порядке
// int n = 8;
// Console.WriteLine($"Массив из {n} чисел , массив [{LenSum(n)} , {LenSum(n)} , {LenSum(n)} , {LenSum(n)} , {LenSum(n)} , {LenSum(n)} , {LenSum(n)} , {LenSum(n)} ]");
// int LenSum(int n)
//     {

//         int[] a = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             a[i] = new Random().Next(2);
//         }
//     return a;
//     }

// int[] GetBinaryArray(int size){
//     int[] result = new int[size];
//     for (int i = 0; i < size; i++){
//         result[i] = new Random().Next(2);
//     }
//     return result;
// }
// int[] array = GetBinaryArray(8);
// Console.WriteLine($"[  {String.Join(",   ", array)}  ]");
// for (int i = 0; i < array.Length - 1; i++){
//     Console.Write($"{array[i]}, ");
// }
// Console.Write($"{array[array.Length - 1]}, ");



//Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
// Console.WriteLine("Введите A: ");
// int a = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите B: ");
// int b = int.Parse(Console.ReadLine());
// if (b<0) {
//     Console.Write("Число B дложно быть больше 0 ");
//     return;
// }
// int gg(int a ,int b) {
//     int sum = 1;
//     for(int i = 0; i < b; i++){
//     sum = sum * a;
//     }
// return sum;
// }
// Console.Write($"Число {a} в степени {b} равно {gg(a , b)}");

//Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// Console.WriteLine("Введите A: ");
// int a = int.Parse(Console.ReadLine());
// int SumG(int a)
// {
//     int sum = 0;
//     while (a > 0) {
//         sum = sum + (a%10);
//         a = a / 10;
//     }
//     return sum;
// }
// Console.Write($"Сумма цифр чсила {a} равна {SumG(a)}");

//Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.


// int[] GetBinaryArray(int size){
//     int[] result = new int[size];
//     for (int i = 0; i < size; i++){
//         result[i] = new Random().Next(10, 51);
//     }
//     return result;
// }
// int[] array = GetBinaryArray(8);
// Console.WriteLine($"[  {String.Join(",   ", array)}  ]");



//Программа которая вводит массивв и считает сумму отрицательных и положительных чисел

// int[] GetRandomArray(int size, int minValue, int maxValue)
// {
//     int[] result = new int[size];
//     for(int i = 0; i < size; i++) 
//     {
//         result[i] = new Random().Next(minValue, maxValue + 1);
//     }
//     return result;
// }

// int[] SumPosNeg(int[] array) 
// {
//     int[] result = new int[2];
//     foreach (int el in array)
//     {
//        result[0] += el > 0 ? el: 0;
//        result[1] += el < 0 ? el: 0;
//     }
//     return result;
// }
// int[] array = GetRandomArray(12, -9 , 9);
// Console.WriteLine(String.Join(", ", array));
// Console.WriteLine($"Positive sum = {SumPosNeg(array)[0]}, negative sum = {SumPosNeg(array)[1]}");




//Программа которая вводит массивв и считает сумму отрицательных и положительных чисел

// int[] arry(int size)
// {
//     int[] arr = new int[size];
//     for(int i = 0; i < size; i++) {
//         arr[i] = new Random().Next(-9 , 11);
//     }
//     return arr;
// }
// int[] sum(int[] arry)
// {
//     int A = 0;
//     int B = 0;
//     for(int i = 0; i < arry.Length; i++)
//     {
//         if (arry[i] < 0) {
//             A = A+arry[i];
//         }
//         else {
//             B = B + arry[i];
//         }
//     }
//     int[] sums = {A,B};
//     return sums;
// }
// Console.Clear();
// Console.WriteLine("Введите разрядность массива ");
// int size = int.Parse(Console.ReadLine());
// int[] mass = arry(size);
// Console.WriteLine($"[{ String.Join(", ", mass) }]");
// Console.WriteLine($"[{ String.Join(", ", sum(mass))}]");

//Написать программу замена элементов массива, если число отрицательное на полоэительное и наоброт

//    int[] array(int size)
//     {
//         int[] arr = new int[size];
//         for(int i = 0; i < size; i++) {
//             arr[i] = new Random().Next(-9 , 11);
//         }
//         return arr;
//     }
//     int[] reserved(int[] array)
//     {

//         for(int i = 0; i < array.Length; i++)
//         {
//                 array[i] = array[i] * (-1);
//         }
//         return array;
//         // int[] result = new int[array.Length];
//         // int j = 0;
//         // foreach(int i in array)
//         // {
//         //    result[j] = i * (-1);
//         // j++;
//         // }
//         // return result;
//     }
//     Console.WriteLine("Введите разрядность массива ");
//     int size = int.Parse(Console.ReadLine());
//     int[] mass = array(size);
//     Console.WriteLine($"[{ String.Join(", ", mass) }]");
//     Console.WriteLine($"[{ String.Join(", ", reserved(mass))}]");


//Задайте массив, наппишите программу которая определяет присутствует ли заданное число в массиве.

// int[] array(int size)
// {
//     int[] arr = new int[size];
//     for(int i = 0; i < size; i++) {
//         arr[i] = new Random().Next(-9 , 11);
//     }
//     return arr;
// }



// bool FindElement(int[] array, int el ) {
//     foreach (var item in array) {
//         if (el == item) return true;
//     }
//     return false;
// }

// Console.WriteLine("Введите разрядность массива ");
// int size = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите числа A ");
// int A = int.Parse(Console.ReadLine());
// int[] mass = array(size);
// Console.WriteLine($"[{ String.Join(", ", mass) }]");
// Console.WriteLine(FindElement) ;

//Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.
// int[] array(int size)
// {
//     int[] arr = new int[size];
//     for (int i = 0; i < size; i++)
//     {
//         arr[i] = new Random().Next(100, 1000);
//     }
//     return arr;
// }
// int[] reserved(int[] array)
// {

//     int A = 0;
//     for (int i = 0; i < array.Length; i++)
//     {
//         if (array[i] % 2 == 0)
//         {
//             A++;
//         }
//     }
//     int[] sums = { A };
//     return sums;
// }
// Console.WriteLine("Введите разрядность массива ");
// int size = int.Parse(Console.ReadLine());
// int[] mass = array(size);
// Console.WriteLine($"[{String.Join(", ", mass)}]");
// Console.WriteLine($" Четных чисел в массиве {String.Join(", ", reserved(mass))}");


//Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

// int[] array(int size)
// {
//     int[] arr = new int[size];
//     for (int i = 0; i < size; i++)
//     {
//         arr[i] = new Random().Next(-10, 10);
//     }
//     return arr;
// }
// int[] reserved(int[] array)
// {

//     int A = 0;
//     for (int i = 0; i < array.Length; i++)
//     {
//         if (i % 2 == 1)
//         {
//             A = A + array[i];
//         }
//     }
//     int[] sums = { A };
//     return sums;
// }
// Console.WriteLine("Введите разрядность массива ");
// int size = int.Parse(Console.ReadLine());
// int[] mass = array(size);
// Console.WriteLine($"[{String.Join(", ", mass)}]");
// Console.WriteLine($" Сумма нечетных индексов {String.Join(", ", reserved(mass))}");

//Задайте массив целых чисел. Найдите разницу между максимальным и минимальным элементов массива.

// int[] array(int size)
// {
//     int[] arr = new int[size];
//     for (int i = 0; i < size; i++)
//     {
//         arr[i] = new Random().Next(-10, 11);
//     }
//     return arr;
// }
// int[] reserved(int[] array)
// {

//     int max = array[0];
//     int min = array[0];
//     for (int i = 0; i < array.Length; i++)
//     {
//         if (array[i] > max) {
//         max = array[i];
//         }

//         if (array[i] < min) {
//             min = array[i];
//         }
//     }
//     if (min < 0) {
//         min = min * -1;
//     }
//     int[] sums = { max - min};

//     return sums;
// }
// Console.WriteLine("Введите разрядность массива ");
// int size = int.Parse(Console.ReadLine());
// int[] mass = array(size);
// Console.WriteLine($"[{String.Join(", ", mass)}]");
// Console.WriteLine($" Разница между максимальным элементом и минимальным равна {String.Join(", ", reserved(mass))}");


//Написать программу которая вводит массив, и меняет элементы в массиве первый с последним и.т.д

// int[] array = GetArray(10, 0, 10);
// Console.WriteLine(String.Join(" ", array));
// Console.WriteLine(String.Join(" ", ReversArray2(array)));
// Console.WriteLine(String.Join(" ", array));
// ReversArray1(array);
// Console.WriteLine(String.Join(" ", array));
// int[] GetArray(int size, int MinValue, int MaxValue)
// {
//     int[] res = new int[size];
//     for (int i = 0; i < size; i++)
//     {
//         res[i] = new Random().Next(MinValue, MaxValue + 1);
//     }
//     return res;
// }
// void ReversArray1(int[] inArray)
// {
//     for (int i = 0; i < inArray.Length / 2; i++) // середина массива
//     {
//         int k = inArray[i];
//         inArray[i] = inArray[inArray.Length - i - 1];
//         inArray[inArray.Length - i - 1] = k;
//     }

// }
// int[] ReversArray2(int[] inArray)
// {
//     int[] result = new int[inArray.Length];
//     for (int i = 0; i < inArray.Length; i++)
//     {
//         result[i] = inArray[inArray.Length - i - 1];
//     }
//    return result;
// }

//Написать программу, которая принимает на вход три числа и проверяет может ли существовать треугольник с сторанами такой длины.
// Console.WriteLine("Введите A");
// int A = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите B");
// int B = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите C");
// int C = int.Parse(Console.ReadLine());
// void Treug(int A, int B, int C){
//     if (A + B < C || A+C < B || C+B < A)  {
//         Console.WriteLine("Треугольника не существует");
//     }
//     else {
//         Console.WriteLine("Существует тругольник");
//     }
// }
// Treug(A , B, C);


//Написать программу которая будет преобразовывать десятичное число в двоичное 

// Console.WriteLine("Введите A");
// int A = int.Parse(Console.ReadLine());
// string res = DecToNum(A, 2);
// Console.WriteLine($"{A}->{res}");
// string DecToNum(int decNumber, int otherSystem)
// {
//    string res = "";
//    string nums = "0123456789ABCDEF";
//    while (decNumber > 0)
//    {
//     res = nums[decNumber%otherSystem] + res;
//     decNumber = decNumber / otherSystem;
//    }
//    return res;
// }


//Написать программму которая будет создавать копию заданного массива с помощью поэлеметного копирования.
// int[] array = GetArray(10, 0, 10);
// Console.WriteLine(String.Join(" ", array));
// Console.WriteLine(String.Join(" ", Coppy(array)));
// int[] GetArray(int size, int MinValue, int MaxValue)
// {
//     int[] res = new int[size];
//     for (int i = 0; i < size; i++)
//     {
//         res[i] = new Random().Next(MinValue, MaxValue + 1);
//     }
//     return res;
// }
// int[] Coppy(int[] inArray)
// {
//     int[] result = new int[inArray.Length];
//     for (int i = 0; i < inArray.Length; i++) 
//     {
//         result[i] = inArray[i];
//     }
//     return result;
// }


//Написать программу Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

// Console.WriteLine("Введите числа");
// int[] values = Array.ConvertAll < string, int >( Console.ReadLine().Split(new char[] {' ', ','}, StringSplitOptions.RemoveEmptyEntries), x=> int.Parse(x) );
// Console.WriteLine(String.Join(" ", ggg(values)));
// int[] ggg(int[] inArray)
// {
//     int b = 0;
//     for (int i = 0; i < inArray.Length; i++) 
//     {
//         if (inArray[i] > 0) {
//         b = b + 1;
//         }
//     }
//    int[] sums = { b };
//    return sums;
// }

//Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями 
//y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

// Console.Write("Введите A: ");
// var A = Convert.ToDouble(Console.ReadLine());
// Console.Write("Введите B: ");
// var B = Convert.ToDouble(Console.ReadLine());
// Console.Write("Введите A1: ");
// var A1 = Convert.ToDouble(Console.ReadLine());
// Console.Write("Введите B1: ");
// var B1 = Convert.ToDouble(Console.ReadLine());

// var x = -(B - B1) / (A - A1);
// var y = A * x + B;
// Console.WriteLine($"Пересечение в точке: ( {x} ;{y} )");


// //Программа таблица
// string[,] table = new string[2, 5];

// // String.Empty
// // table [0,0] table [0,1] table [0,2] table [0,4]
// // table [1,0] table [1,1] table [1,2] table [1,4]

// table[1, 2] = "слово";
// for (int rows = 0; rows < 2; rows++)
// {
//     for (int i = 0; i < 5; i++)
//     {
//         Console.WriteLine($"-{table[rows, i]}-");
//     }
// }

// //Программа матрица чисел(ПЕРВЫЙ ВАРИАНТ)
// int[,] matrix = new int[3, 4];
// for (int i = 0; i < 3; i++)
// {
//  for (int j = 0; j < 4; j++)
//  {
//  Console.Write($"{matrix[i, j]} ");
//  }
//  Console.WriteLine();
// }

// //Программа матрица чисел(ВТОРОЙ ВАРИАНТ)
// int[,] matrix = new int[3, 4];
// for (int i = 0; i < matrix.GetLength(0); i++) //строка
// {
//  for (int j = 0; j < matrix.GetLength(1); j++) //столбец
//  {
//  Console.Write($"{matrix[i, j]} ");
//  }
//  Console.WriteLine();
// }


//Написать программу которая выводит матрицу с рандомными числами
// void PrintArray(int[,] matr)
// {
//     for (int i = 0; i < matr.GetLength(0); i++) //строка
//     {
//         for (int j = 0; j < matr.GetLength(1); j++) //столбец
//         {
//             Console.Write($"{matr[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// void FillArray(int[,] matr)
// {
//     for (int i = 0; i < matr.GetLength(0); i++) //строка
//     {
//         for (int j = 0; j < matr.GetLength(1); j++) //столбец
//         {
//             matr[i, j] = new Random().Next(1, 10);
//         }
//     }
// }
// int[,] matrix = new int[3, 4];
// PrintArray(matrix);
// FillArray(matrix);
// Console.WriteLine("--------");
// PrintArray(matrix);


// //Написать программу которая закрашивает область
// int[,] pic = new int[,]
// {
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
// {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
// {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
// };

// void PrintImage(int[,] image)
// {
//     for (int i = 0; i < image.GetLength(0); i++)
//     {
//         for (int j = 0; j < image.GetLength(1); j++)
//         {
//             if (image[i, j] == 0) Console.Write($" ");
//             else Console.Write($"+");
//         }
//         Console.WriteLine();
//     }
// }

// void FillImage(int row, int col)
// {
//     if (pic[row, col] == 0)
//     {
//         pic[row, col] = 1;
//         FillImage(row - 1, col);
//         FillImage(row, col - 1);
//         FillImage(row + 1, col);
//         FillImage(row, col + 1);
//     }
// }

// PrintImage(pic);
// FillImage(13, 13);
// PrintImage(pic);


// //Написать программу которая будет считать факториал

// double Factorial(int n)
// {
//  // 1! = 1
//  // 0! = 1
//  if(n == 1) return 1;
//  else return n * Factorial(n-1);
// }
// for(int i = 1; i < 40;i++)
// {
//    Console.WriteLine($"{i}! = {Factorial(i)}");
// }

// //Написать программу которая будет считать числа Фибоначи

// // f(1) = 1
// // f(2) = 1
// // f(n) = f(n-1) + f(n-2)
// double Fibonacci(int n)
// {
//  if(n == 1 || n == 2) return 1;
//  else return Fibonacci(n-1) + Fibonacci(n-2);
// }
// for (int i = 1; i < 50; i++)
// {
//  Console.WriteLine($"f({i}) = {Fibonacci(i)}");
// }

// //  Написать программу создает матрицу размером mxn и заполнить ее рандомными целыми числами.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//         int[,] result = new int[m, n];
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 result[i, j] = new Random().Next(minValue, maxValue + 1);
//             }
//         }
//         return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for(int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for(int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// //Написать программу создает матрицу размером mxn и заполнить ее числами A[i, j] = i+j;

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns);
// PrintArray(array);
// int[,] GetArray(int m, int n)
// {
//         int[,] result = new int[m, n];
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 result[i, j] = i + j;
//             }
//         }
//         return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for(int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for(int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// //Написать прогрумму, задайте двемерный массив, найдите элементы, 
// //у которых оба индекса четные и замените их элементы на их квадраты

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 1, 9);
// PrintArray(array);

// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//         int[,] result = new int[m, n];
//         for(int i = 0; i < m; i++)
//         {
//             for(int  j = 0; j < n; j++)
//             {
//                 result[i, j] = new Random().Next(minValue, maxValue + 1);
//                 if (i % 2 == 1 && j % 2 == 1)
//                 {
//                     result[i,j] = result[i, j] * result[i, j];
//                 }

//             }
//         }
//         return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for(int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for(int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// //Написать прогрумму, задайте двемерный массив, найдите элементы, 
// //которых лежат на гланой диагонали и посчитайте их сумму. 

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 1, 9);
// PrintArray(array);
// Console.WriteLine();
// ChangeArray(array);



// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int A = 0;
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);


//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// int[,] ChangeArray(int[,] array)
// {
//     int sum = 0;
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//              if (i == j)
//              {
//                 sum = array[i, j] + sum;
//              }
//         }
//     }
//     Console.WriteLine($"Cумма главной диагонали равна {sum}");
//     return array;
// }

// //Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// double[,] array = GetArray(rows, columns);
// PrintArray(array);
// double[,] GetArray(int m, int n)
// {
//         double[,] result = new double[m, n];
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 result[i, j] =  new Random().NextDouble() * 10;
//             }

//         }
//         return result;
// }
// void PrintArray(double[,] inArray)
// {
//     for(int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for(int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// //Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает 
// //значение этого элемента или же указание, что такого элемента нет.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// Console.WriteLine("Введите строку");
// int a = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите столбец");
// int b = int.Parse(Console.ReadLine());
// Console.WriteLine();
// Сhislo(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

// int[,] Сhislo(int[,] array)
// {
//     if (a < array.GetLength(0) && b < array.GetLength(1))
//     {
//         Console.WriteLine($"Число {array[a, b]}");
//     }
//     else
//     {
//         Console.WriteLine($"{a} {b} -> такого индекса в массиве нет");
//     }
//     return array;
// }

// // Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// SumColumns(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// int[,] SumColumns(int[,] array)
// {
//     for (int j = 0; j < array.GetLength(1); j++)
//     {
//         double sum = 0;
//         for (int i = 0; i < array.GetLength(0); i++)
//         {
//             sum = sum + array[i, j];
//         }
//         Console.Write($"{sum / array.GetLength(0)} ");
//     }
//     return array;
// }


//Задайте двумерный массив. Напишите программу, которая меняет первую строку с последней двумерного массива.
// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// int[,] array2 = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// Console.WriteLine();
// ProductMatrix(array);
// PrintArray(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// int[,] ProductMatrix(int[,] array)
// {
//     for (int j = 0; j < array.GetLength(1); j++) 
//     {
//         int a = array[array.GetLength(0) - 1, j];
//         array[array.GetLength(0) - 1, j] = array[0,j];
//         array[0, j] = a;
//     }
//     return array;

// }

//Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// SortArray(array);
// Console.WriteLine();
// PrintArray(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// int[,] SortArray(int[,] array)
//  {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             for (int k = 0; k < array.GetLength(1) - 1; k++)
//             {
//                 if (array[i, k] < array[i, k + 1])
//                 {
//                     int max = array[i, k + 1];
//                     array[i, k + 1] = array[i, k];
//                     array[i, k] = max;
//                 }
//             }
//         }
//     }
//     return array;
// }

//Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// PrintArray(array);
// SumMinLine(array);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// int[,] SumMinLine(int[,] array)
// {
//     int min = 0;
//     int minSum = 0;
//     int sum = 0;
//     for (int i = 0; i < array.GetLength(1); i++)
//     {
//         min = min + array[0, i];
//     }
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++) 
//         {
//             sum = sum + array[i, j];
//         }
//         Console.WriteLine();
//         Console.Write($" {sum} ");
//         if (sum < min)
//         {
//             min = sum;
//             minSum = i;
//         }
//         sum= 0;
//     }

//     Console.WriteLine();
//     Console.WriteLine();
//     Console.Write($"{minSum + 1} строка");
//     return array;
// }


//Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

// Console.WriteLine("Ввелите количество строк массива");
// int rows = int.Parse(Console.ReadLine());
// Console.WriteLine("Ввелите количество столбцов массива");
// int columns = int.Parse(Console.ReadLine());
// int[,] array = GetArray(rows, columns, 0, 10);
// int[,] array2 = GetArray(rows, columns, 0, 10);
// int[,] array3 = GetArray(rows, columns, 0, 0);
// PrintArray(array);
// Console.WriteLine();
// PrintArray(array2);
// MultiplyMatrix(array, array2, array3);
// Console.WriteLine($"Произведение первой и второй матриц:");
// PrintArray(array3);
// int[,] GetArray(int m, int n, int minValue, int maxValue)
// {
//     int[,] result = new int[m, n];
//     for (int i = 0; i < m; i++)
//     {
//         for (int j = 0; j < n; j++)
//         {
//             result[i, j] = new Random().Next(minValue, maxValue + 1);
//         }
//     }
//     return result;
// }
// void PrintArray(int[,] inArray)
// {
//     for (int i = 0; i < inArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < inArray.GetLength(1); j++)
//         {
//             Console.Write($" {inArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }
// void MultiplyMatrix(int[,] array, int[,] array2, int[,] array3)
// {
//   for (int i = 0; i < array3.GetLength(0); i++)
//   {
//     for (int j = 0; j < array3.GetLength(1); j++)
//     {
//       int sum = 0;
//       for (int k = 0; k < array.GetLength(1); k++)
//       {
//         sum = sum + array[i,k] * array2[k,j];
//       }
//       array3[i,j] = sum;
//     }
//   }
// }


//Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно 
//выводить массив, добавляя индексы каждого элемента. Массив размером 2 x 2 x 2
// int[,,] array = new int[2, 2, 2];
// FillArray(array);
// PrintIndex(array);

// void PrintIndex(int[,,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             Console.WriteLine();
//             for (int k = 0; k < array.GetLength(2); k++)
//             {
//                 Console.Write($"{array[i, j, k]}({i},{j},{k}) ");
//             }
//         }
//     }
// }

// void FillArray(int[,,] array)
// {
//     int count = 11;
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             for (int k = 0; k < array.GetLength(2); k++)
//             {
//                 array[k, i, j] = array[k, i, j] + count;
//                 count = count + 2;
//             }
//         }
//     }
// }

//Напишите программу, которая заполнит спирально массив 4 на 4.

// Console.WriteLine("Введите размер массива");
// int size = Convert.ToInt32(Console.ReadLine());

// int[,] nums = new int[size, size];

// int num = 1;
// int i = 0;
// int j = 0;

// while (num <= size * size)
// {
//     nums[i, j] = num;
//     if (i <= j + 1 && i + j < size - 1)
//         ++j;
//     else if (i < j && i + j >= size - 1)
//         ++i;
//     else if (i >= j && i + j > size - 1)
//         --j;
//     else
//         --i;
//     ++num;
// }

// PrintArray(nums);

// void PrintArray(int[,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         Console.Write("[ ");
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             Console.Write(array[i, j] + " ");
//         }
//         Console.Write("]");
//         Console.WriteLine("");
//     }
// }


//Console.WriteLine("Введите Число");
//int a = int.Parse(Console.ReadLine());
// string NumberFor(int a)
// {
//     string result = String.Empty;
//     for(int i = a; i > 0; i-- )
//     {
//         result = result + $"{i} ";
//     }
//     return result;
// }
// Console.WriteLine(NumberFor(a));

//Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.


//Console.WriteLine("Введите Число");
//int a = int.Parse(Console.ReadLine());
// string Number(int a)
// {
//     if (a >= 1)
//     {
//         return $"{a} " + Number(a - 1);
//     }
//     else
//     {
//         return String.Empty;
//     }
// }
// Console.WriteLine(Number(a));

//Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
// Console.WriteLine("Введите Число A");
// int a = int.Parse(Console.ReadLine());
// Console.WriteLine("Введите Число B");
// int b = int.Parse(Console.ReadLine());
// int Sum(int a , int b)
// {
//     if (a <= b)
//     {
//          return a + Sum(a + 1, b);
//     }
//     else
//     {
//        return 0;
//     }
// }

// Console.WriteLine(Sum(a, b));

//Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n
// Console.WriteLine("Введите начальное число A:");
// int m = int.Parse(Console.ReadLine());

// Console.WriteLine("Введите начальное число B:");
// int n = int.Parse(Console.ReadLine());

// int Function(int m, int n)
// {
//     if (m == 0)
//     {
//         return n + 1;
//     }
//     if (m != 0 && n == 0)
//     {
//         return Function(m - 1, 1);
//     }
//     if (m > 0 && n > 0)
//     {
//         return Function(m - 1, Function(m, n - 1));
//     }
//     return Function(m, n);
// }

// Console.WriteLine($"Функция Аккермана для чисел A({m},{n}) = {Function(m, n)}");


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
Console.WriteLine("Массив из строк длина которых <=3 символа ");
PrintArray(NewTextArray);

