public class perfect
{
   public static void main(String[] args)
   {
   int i,n=6,sum=0,num;
   for(i=1;i<n;i++)
   {
   if(n%i==0)
   {
    sum=sum+i;
   }
   }
if(sum==n)
{
System.out.print("perfect");
}
else
{
System.out.print("not perfect");
}
}
}
