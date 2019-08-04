import java.util.*;
public class lenth_string
{
public static void main(String[] args)
{

Scanner ob=new Scanner(System.in);
System.out.println("Enter a string:");
String s1=ob.nextLine();
System.out.print("Entered string is:" + s1);
int n=s1.length();
System.out.println("\n length is:" + n);
}
}