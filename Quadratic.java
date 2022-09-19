import java.util.Scanner;  
public class Quadratic{  
public static void main(String[] Strings)   
{  
    //taken input 
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of a ");  
double a = input.nextDouble();  
System.out.print("Enter the value of b ");  
double b = input.nextDouble();  
System.out.print("Enter the value of c ");  
double c = input.nextDouble();  
double d= b * b - 4.0 * a * c;  
if (d> 0.0)   
{  
    //using the fumula to receive  the output of x1 or x2
double x1 = (-b +((d) * (d ))) / (2.0 * a);  
double x2 = (-b -((d) * (d ))) / (2.0 * a);  
System.out.println("The roots are " + x1 + " and " + x2);  
}   
else if (d == 0.0)   
{  
double x1 = (-b +((d) * (d ))) / (2.0 * a);
System.out.println("The root is " + x1);  
}   
else   
{  
System.out.println("There is no root ");  
}  
}  
}