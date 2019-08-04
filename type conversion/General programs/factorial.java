//Factorial of the given number using recursion..............................
import java.util.*;
public class factorial
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter A number:");
int n=ob.nextInt();
int factorial=fact(n);
System.out.print("factorial of " +n+"  is:"+factorial);
}
static int fact(int n)
{
int t;
if(n==1){
return 1;
}
   t=fact(n-1)*n;
return t;
//System.out.print(t);
}
}