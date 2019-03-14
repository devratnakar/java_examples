import java.util.*;
class table{
public static void main(String...p){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter number to print table");
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}}}