//String token...................
import java.util.*;
public class string_token
{
public static void main(String[] args)
{
Scanner ob1=new Scanner(System.in);
System.out.println("enter string:");
String s1=ob1.nextLine();
StringTokenizer ob2=new StringTokenizer(s1);
System.out.println(ob2.countTokens());
System.out.println(ob2.nextToken());
//System.out.println(ob2.nextToken(","));
String s=ob2.nextToken();
System.out.println(s);
System.out.println(ob2.hasMoreTokens());
}
}

