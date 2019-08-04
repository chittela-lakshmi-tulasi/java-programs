class test
{
int a;
test()
{
a=100;
System.out.println(a);
}
void display(int a)
{
 a=a;
System.out.println(a);
}
}
class test_pro
{
public static void main(String arg[])
{
test ob=new test();
ob.display(10);
}
}