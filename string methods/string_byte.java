import java.util.*;
public class string_byte
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter a string:");
String s=ob.nextLine();
byte[] b=s.getBytes();
int i;
for(i=0;i<b.length;i++)
{ 
System.out.print(b[i]+"\t");
}
}
}
