import java.util.*;
public class strong
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter number:");
int n=ob.nextInt();
int num=n,sum=0,r,fact,i;
while(n>0)
{
r=n%10;
fact=1;
 for(i=1;i<=r;i++)
 {
  fact=fact*i;
 }
sum=sum+fact;
n=n/10;
}
if(sum==num)
{
System.out.print("strong");
}
else
{
System.out.print("not strong");
}
}
}