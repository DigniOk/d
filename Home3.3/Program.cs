Console.WriteLine("Введите X: ");
int x = int.Parse(Console.ReadLine());
int i = 1;
int n = x;
if (x < 0) {
i = x;
n = -x;
x = -1;
}
int[] result = new int[n];
int j = 0;
for(; i<=x;i++){
result[j] = i * i * i;
    if (result[j]<0){
        result[j] = result[j] * (-1);
    }
j++;
}
for(j=0; j < n; j++) {
Console.WriteLine(result[j]);
}