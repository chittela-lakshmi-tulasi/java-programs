//function without parameters,with out return  value
class test
{
int a;
int b;
test(int x)
{
a=x;
System.out.println(a);
}
void display()
{
System.out.println(a);
//return a;
}
}
class test_code
{
public static void main(String[] args)
{
test ob=new test(10);
ob.display();
}
}