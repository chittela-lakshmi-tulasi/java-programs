public class reverse_while
{
public  static void main(String[] args)
{
int n=5643,r,sum=0;

while(n>0)
{
  r=n%10;
  sum=sum*10+r;
  n=n/10;
  
}
System.out.print(sum);
}
}

