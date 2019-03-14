import java.util.Scanner;
class matrix_addition{
public static void main(String...p){
Scanner sc=new Scanner(System.in);
System.out.println("plz enter first array element");
int a[][]=new int[2][2];
for(int i=0;i<a.length;i++)
for(int j=0;j<a[i].length;j++)
a[i][j]=sc.nextInt();
System.out.println("plz dusara wala bhi dal do");
int b[][]=new int[2][2];
for(int i=0;i<b.length;i++)
for(int j=0;j<b[i].length;j++)
b[i][j]=sc.nextInt();
int c[][]=new int[2][2];
for(int i=0;i<a.length;i++)
for(int j=0;j<a[i].length;j++)
c[i][j]=a[i][j]+b[i][j];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(c[i][j]+"\t");
}System.out.print("\n");}








}}


