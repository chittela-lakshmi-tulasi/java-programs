import java.util.*;
public class strong_range
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter number:");
int n=ob.nextInt();
int num,sum,r,fact,i,j;
for(i=1;i<=n;i++)
{
num=i;
sum=0;
   while(num>0)
   {
       r=num%10;
      fact=1;
      for(j=1;j<=r;j++)
      {
      fact=fact*j;
       }
    sum=sum+fact;
    num=num/10;
    }
if(sum==i)
{
System.out.println(i);
}
}
}
}