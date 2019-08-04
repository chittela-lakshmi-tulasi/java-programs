public class pal_while
{
public static void main(String[] args)
{
int n=989,r,sum=0,m;
m=n;
while(n>0)
{
  r=n%10;
  sum=sum*10+r;
  n=n/10;
}
if(sum==m)
{
System.out.print("palindrome");
}
else
{
System.out.print("not a palindrome");
}
}
}


