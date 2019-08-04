public class co_prime
{
public static void main(String[] args)
{
int a=3,b=9,r,gcd;
r=a%b;
while(r!=0)
{
 
a=b;
b=r;
r=a%b;
}
System.out.println("GCD is:" + b);
if(b==1)
{

System.out.print("coprime");
}
else
{
System.out.print("not");
}
}
}