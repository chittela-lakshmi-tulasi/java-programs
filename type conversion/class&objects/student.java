class student
{
int no,roll;
void display()
{
System.out.println(no);
System.out.println(roll);
}
}
class details
{
public static void main(String[] args)
{
student s1=new student();
s1.no=26;
s1.roll=1234567890;
s1.display();
student s2=new student();
s2.no=2;
s2.roll=1234347890;
s2.display();
}
}