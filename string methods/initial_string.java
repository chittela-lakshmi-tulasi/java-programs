import java.lang.*;
public class initial_string
{
public static void main(String[] args)
{
String s1="hello";
String s2=new String();
s2 ="hi";
String s3=new String("how");
char s4[]={'a','r','e'};//giving string as character array
String s5=new String(s4,0,2);//reading string from the character array
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
}
}