Console.WriteLine("Введите X: ");
string x = Console.ReadLine();
if (x.Length<5 || x.Length>5)  {
Console.WriteLine("Число не пятизначное");
return;
}
if (x[0] == x[4] && x[1] == x[3]) {
    Console.WriteLine("Число палидром");
}
else {
    Console.WriteLine("Число не палидром");
}