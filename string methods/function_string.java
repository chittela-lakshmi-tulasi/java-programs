import java.util.*;
public class function_string
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int a=66;
System.out.print("Enter a string:");
String s=ob.nextLine();
System.out.println(s.isEmpty());
System.out.println(s+"how are you");        // without trim()  
System.out.println(s.trim()+"how are you"); // with trim() 
String s1=String.valueOf(a);
System.out.println(s1+17);
System.out.println(s.contains("i"));       

}
}