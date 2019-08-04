//Reverse of string by converting string_char
import java.util.*;
public class string_char
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter any string:");
String s=ob.nextLine();
int i;
char ch[]=s.toCharArray();
int n=ch.length;
for(i=0;i<n;i++)
{
System.out.print(ch[i] +"\t");
}
}
}
 