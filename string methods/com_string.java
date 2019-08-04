import java.util.*;
public class com_string
{
public static void main(String[] args)
{

Scanner ob=new Scanner(System.in);
System.out.println("Enter string1:");
String s1=ob.nextLine();
System.out.println("Enter string2:");
String s2=ob.nextLine();
System.out.println("Entered string1 is:" + s1);
System.out.println("Entered string2 is:" + s2);
int n=s1.compareTo(s2);
int m=s1.compareToIgnoreCase(s2);
System.out.println(n);
System.out.println(m);
}
}