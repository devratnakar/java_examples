import java.util.*;
class month{public static void main(String...p){
String name;
System.out.println("plz eneter name of the month");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
switch (name.toLowerCase())
{
case "january":System.out.println("1");
break;
case "february":
System.out.println("2");
break;
case "march":
System.out.println("3");
break;
case "april":
System.out.println("4");
break;
//in the same way all months
default:
System.out.println("invalid months");
}}}