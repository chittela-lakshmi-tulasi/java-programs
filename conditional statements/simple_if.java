
public class simple_if
{
public static void main(String[] args)
{
int a,b,c,max;
System.out.println("enter a value:");
a=ob.nextInt();
System.out.println("enter b value:");
b=ob.nextInt();
System.out.println("enter c value:");
c=ob.nextInt();
Scanner ob=new Scanner(System.in);
max=a;
if(b>max)
{
max=b;
}
if(c>max)
{
max=c;
}
 
System.out.print(max + "is greater");
}
}
