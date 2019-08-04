class test
{
int a;
test()
{
a=10;
System.out.println(a);
}
void display(test ob)
{
System.out.println("Inside="+a);
a=ob.a;
System.out.println("Value="+a);
}
}
class test_code
{
public static void main(String[] args)
{
test ob=new test();
test ob1=new test();
ob1.display(ob);
ob.a=70;
ob1.display(ob);
}
}
