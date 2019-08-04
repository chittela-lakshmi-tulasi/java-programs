public class reverse_do
{
public static void main(String[] args)
{
int n=789,r,sum=0;
//m=n;
do
{
  r=n%10;
  sum=sum*10+r;
  n=n/10;
}
while(n>0);
System.out.print(sum);
}
}



