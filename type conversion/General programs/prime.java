 public class prime
{
	public static void main(String[]args)
	{
	System.out.println("hello");
	int n=4,i,c=0;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			c=c+1;
		}
	}
        if(c==1)
	{
	System.out.print("prime");
	}
	else
	{

 	System.out.print(" not prime");       
	}
	}
}