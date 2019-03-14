import java.util.*;
class table{
public static void main(String...p){
Scanner sc=new Scanner(System.in);
int x;
int y;
System.out.println("enter number to print to print");
x=sc.nextInt();
y=sc.nextInt(); x = x ^ y; // x now becomes 15 (1111) 
        y = x ^ y; // y becomes 10 (1010) 
        x = x ^ y; // x becomes 5 (0101) 
          
        System.out.println("After swap: x = "
                            + x + ", y = " + y); 
    } 
} 
  

//System.out.println("number before swapping="+m","+n);
//m=m+n;
//n=m-n;
//m=m-n;

//System.out.println("number after swapping=" +m ","+n);
//System.out.println(m);
//System.out.println(n);
//}}