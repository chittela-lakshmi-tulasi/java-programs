public class perfect_range
{
   public static void main(String[] args)
   {
   int n,m=1000;
for(n=1;n<=m;n++)
{
   int sum=0,i;
   for(i=1;i<n;i++)
   {
 
   if(n%i==0)
   {
    
    sum=sum+i;
   }
   }
    if(sum==n)
    {
     System.out.println(n);
    }
}
}
}
