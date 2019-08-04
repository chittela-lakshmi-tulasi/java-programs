import java.util.*;
public class equal_string
{
public static void main(String[] args)
{

Scanner ob=new Scanner(System.in);
System.out.println("Enter string1:");
String s1=ob.nextLine();
System.out.print("Entered string1 is:" + s1);
System.out.println("Enter string2:");
String s2=ob.nextLine();
System.out.println("s2=" + s2);
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
boolean s3=s1.equals(s2);
System.out.println(s3);
boolean s4=s1.equalsIgnoreCase(s2);
System.out.println(s4);
}
}