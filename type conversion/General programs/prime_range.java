//Prime numbers in given range....................................
public class prime_range
{
	public static void main(String[] args)
	{
        int n=1;
	for(n=1;n<100;n++)
	{
		int i;
		int count=0;
   		for(i=1;i<n;i++)
   		{
		 if(n%i==0)
		 {
		   count++;
		 }
	        }
              if(count==1)
              {
              System.out.println(n);
              }
         }
        }
}
