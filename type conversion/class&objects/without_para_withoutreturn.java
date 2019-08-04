//function without parameters,with out return  value
class test
{
int a;
int b;
test()
{
a=10;
System.out.println(a);
}
void display()
{
b=20;
System.out.println(b);
}
}
class test_code
{
public static void main(String[] args)
{
test ob=new test();
ob.display();
}
}