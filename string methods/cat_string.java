import java.util.*;
public class cat_string
{
public static void main(String[] args)
{

Scanner ob=new Scanner(System.in);
System.out.println("Enter string1:");
String s1=ob.nextLine();

System.out.println("Enter string2:");
String s2=ob.nextLine();
System.out.println("Entered string 1:" + s1);
System.out.println("Entered string2 is:" + s2);
String s3=s1.concat(s2);
System.out.println("After concating the strings:" +  s3);
System.out.print(s1+s2);//using concatenating operator
}
}