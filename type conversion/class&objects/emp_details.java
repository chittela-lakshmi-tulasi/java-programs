import java.util.Scanner;
//import java.lang.String;
class employee
{
int salary,id;
String name;
String dept;
void taking()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter name:");
name=ob.nextLine();
System.out.println("Enter id:");
id=ob.nextInt();
System.out.println("Enter salary:");
salary=ob.nextInt();
System.out.println("Enter department:");
//char dept;
dept="cse";
//ob.nextLine();
//dept=ob.next().charAt(0);
}
void displaying()
{
System.out.print(name +"\t"+id+"\t"+dept+"\t"+salary);
}
}
class test
{
public static void main(String[] args)
{
employee emp=new employee();
emp.taking();
emp.displaying();
}
}
