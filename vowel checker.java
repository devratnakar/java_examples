import java.util.*;
class vowel{
public static void main(String...p){
Scanner sc=new Scanner(System.in);

System.out.println("enter a alphabet");
   char c = sc.next().charAt(0); 
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("vowel");
else
System.out.println("not vowel");
}}

