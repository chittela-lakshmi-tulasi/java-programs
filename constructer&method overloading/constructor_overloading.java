//Constructor over loading.................
class test
{
int a,b;
test()
{

System.out.println("No parameter");
a=10;
b=20;
System.out.println(a+"  "+b);
}
test(int x)
{
System.out.println("One parameter");
a=x;
b=x;
System.out.println(a+"  "+b);
}
test(int x,int y)
{
System.out.println("Two parameter");
a=x;
b=y;
System.out.println(a+"  "+b);
}
}
class test_code
{
public static void main(String[] args)
{
test ob1=new test();
test ob2=new test(200);
test ob3=new test(80,50);
}
}
