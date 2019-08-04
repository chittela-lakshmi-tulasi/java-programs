//function without parameters,with return value
class test
{
int a;
test()
{
a=10;
System.out.println(a);
}
int display()
{
return a;
}
}
class test_code
{
public static void main(String[] args)
{
test ob=new test();

int c=ob.display();
System.out.println(c);
}
}