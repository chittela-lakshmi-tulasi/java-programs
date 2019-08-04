public class pal_do
{
public static void main(String[] args)
{
int n=78987,r,sum=0,m;
m=n;
do
{
  r=n%10;
  sum=sum*10+r;
  n=n/10;
}
while(n>0);
if(sum==m)
{
System.out.print("pal");
}
else
{
System.out.print("not");
}
}
}



