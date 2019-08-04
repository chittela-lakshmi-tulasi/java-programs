public class lcm
{
public static void main(String[] args)
{
int a=65,l,b=15,r,d;
d=a*b;
r=a%b;
while(r!=0)
{
a=b;
b=r;
r=a%b;
}
System.out.println("GCD is:" + b);
System.out.println("LCM is:" + (d/b));
}
}

