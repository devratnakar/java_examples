import java.util.*;
public class result{
public static void main(String...p)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("plz enter marks");
int num=sc.nextInt();
if(num>60){
System.out.println("first division");}
else if(num<60){
if(num>50){
System.out.println("second division");
}
else if(num>33)
{
System.out.println("third");}
else if(num<33)
{System.out.println("fail ho");}}
}}