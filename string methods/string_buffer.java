//String buffer..........................
import java.util.*;
public class string_buffer
{
public static void main(String[] args)
{
Scanner ob1=new Scanner(System.in);
System.out.print("enter string:");
String s1=ob1.nextLine();
StringBuffer ob2=new StringBuffer(s1);
System.out.println(ob2.capacity());
int n=ob2.length(),i;
System.out.println(n);
for(i=0;i<n;i++)
{
System.out.println(ob2.charAt(i));
}
System.out.println(ob2.append("tulasi"));
System.out.println(ob2.reverse());
System.out.println(ob2.insert(2,"hello"));
System.out.println(ob2.replace(2,6,"hiii"));
System.out.println(ob2.delete(2,6));
System.out.println(ob2.substring(2));
System.out.println(ob2);
System.out.println(ob2.substring(1,6));
}
}
