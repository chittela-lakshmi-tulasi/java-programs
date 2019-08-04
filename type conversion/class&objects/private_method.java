class test
{
private int a;
test()
{
a=10;
}
int display()
{
return a;
}
}
class test_pro
{
public static void main(String[] args)
{
test ob=new test();
//ob.a=10;
System.out.println(ob.display());
}
}