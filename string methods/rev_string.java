// Reverse of String...............
import java.lang.*;
public class rev_string
{
public static void main(String[] args)
{
char a[]={'s','i','v','a','t','u','l','a','s','i'},temp;
int n=a.length;
int  i;
for(i=0;i<n/2;i++)
{
temp=a[i];
a[i]=a[n-i-1];
a[n-i-1]=temp;
}
for(i=0;i<n;i++)
{
System.out.print(a[i] +"\t");
}
}
}