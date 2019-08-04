//String functions.....................................
import java.util.*;
public class string_fun
{
public static void main(String[] args)
{

Scanner ob=new Scanner(System.in);
System.out.println("Enter a string:");
String s1=ob.nextLine();
System.out.println("Entered string is:" + s1);
String a=s1.toUpperCase();
System.out.println(a);
String b=s1.toLowerCase();
System.out.println(b);
String c=s1.substring(2);
System.out.println(c);
String d=s1.substring(1,4);
System.out.println(d);

String e=s1.replace('u','A');
System.out.println(e);
String f=s1.replace("la","LA");
System.out.println(f);
String g=s1.replaceAll("a","A");
System.out.println(g);
String h=s1.replaceFirst("u","U");//it raplaces only string not characters
System.out.println("raplace first:" + h);
int i=s1.indexOf('a');
System.out.println(i);
int j=s1.lastIndexOf('i');
System.out.println(j);
boolean k=s1.startsWith("T");//it accepts only string not characters
System.out.println(k);
boolean l=s1.endsWith("i");//it accepts only string not characters
System.out.println(l);
}
}