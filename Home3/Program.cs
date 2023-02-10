Console.WriteLine("Введите Число A ");
int a = int.Parse(Console.ReadLine());
int b = 1;
while (b<a) { 
    if ( b % 2 == 1) {
    }
    else {
       Console.WriteLine("Ответ : " + b );
    }
    b = b + 1;
}