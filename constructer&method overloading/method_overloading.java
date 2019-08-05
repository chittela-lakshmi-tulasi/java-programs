//Method  over loading.................
import java.lang.Math;
class test
{
int l,w;
float r;
double b,h;
void area(float x)
{
r=x;
System.out.println("Circle area:");
System.out.println((Math.PI)*r*r);
}
void area(int y,int z)
{
System.out.println("Rectangle area:");
l=y;
w=z;
System.out.println(l*w);
}
void area(double o,double p)
{
System.out.println("Trianlge area:");
b=o;
h=p;
System.out.println((0.5)*b*h);
}
}
class test_code
{
public static void main(String[] args)
{
test ob1=new test();
ob1.area(3);
ob1.area(10,5);
ob1.area(4f,6f);
//test ob2=new test();

//test ob3=new test();

}
}
