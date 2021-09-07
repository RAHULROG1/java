import java.util.*;
class Person
{
String name,gender,address;
int age;

void Person()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Name");
name=sc.next();
System.out.println("Enter the Gender");
gender=sc.next();
System.out.println("Enter the Age");
age=sc.nextInt();
System.out.println("Enter the Address");
address=sc.next();
}
}
class Employee extends Person
{
int empid;
String company_name,qualification;
float salary;

void Employee()
{
super.Person();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Company Name");
company_name=sc.next();
System.out.println("Enter the Qualification");
qualification=sc.next();
System.out.println("Enter the Salary");
salary=sc.nextFloat();
}
}
class Teacher extends Employee
{
String sub,dept;
int teacherid;

Teacher()
{
super.Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Teacher id");
teacherid=sc.nextInt();
System.out.println("Enter the Department");
dept=sc.next();
System.out.println("Enter the Subject");
sub=sc.next();
}

void display()
{
System.out.println("\nDetails are\n");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(gender);
	System.out.print("\t");
	System.out.print(age);
	System.out.print("\t");
	System.out.print(address);
	System.out.print("\t");
	System.out.print(company_name);
	System.out.print("\t");
	System.out.print(qualification);
	System.out.print("\t");
	System.out.print(salary);
	System.out.print("\t");
	System.out.print(teacherid);
	System.out.print("\t");
	System.out.print(dept);
	System.out.print("\t");
	System.out.print(sub);
}
}


public class Myclass
{
public static void main(String args[])
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of details to be entered");
int n=sc.nextInt();
Teacher tr[]=new Teacher[n];
	  
	   	do
	{
		System.out.println("\nEmployee Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				tr[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				tr[i].display();
				}		
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}
		
}
	