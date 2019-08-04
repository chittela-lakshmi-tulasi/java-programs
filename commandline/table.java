//Printing table from commandline arguments................. 
public class table
{
public static void main(String[] args)
{
int i, a=Integer.parseInt(args[0]);
Scanner ob=new Scanner(System.in);
System.out.print("enter number ");
int n=ob.nextInt();
System.out.print(a   +"table is:\n");
for(i=1;i<=n;i++)
System.out.println(a + "*" + i+ "=" +(a*i));
}
}

