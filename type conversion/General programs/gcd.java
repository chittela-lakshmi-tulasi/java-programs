public class gcd
{
public static void main(String[] args)
{
int a=78,b=95,r,gcd;
r=a%b;
while(r!=0)
{
 
a=b;
b=r;
r=a%b;
}
System.out.println("GCD is:" + b);
}
}