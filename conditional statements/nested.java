import java.util.Scanner;
public class nested
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int a,b,c;
System.out.println("enter a value:");
a=ob.nextInt();
System.out.println("enter b value:");
b=ob.nextInt();
System.out.println("enter c value:");
c=ob.nextInt();
if(a>b)
{
	if(a>c)
	{
	
System.out.print("a is greater");
	}
}
else
{ 
	if(b>c)
	{
		System.out.print("b is greater");
	
	}
	else
	{
	System.out.print("c is greater");
	
	}
}

}
}