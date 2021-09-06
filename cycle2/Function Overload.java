import java.util.Scanner;
class OverloadDemo
{
	float l,b,a;
	double r;
	Scanner sc=new Scanner(System.in);
	
	 void readrect()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the length and breadth of rectangle");
		l=sc.nextFloat();
		b=sc.nextFloat();	
		od.area(l,b);
	}
	
	void readsquare()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the side of square");
		a=sc.nextFloat();
		od.area(a);
	}
	
	void readcircle()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the radius of circle");
		r=sc.nextLong();
		od.area(r);
	}
	
    void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units\n");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units\n");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units\n");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
	    int choice;
	    OverloadDemo ob = new OverloadDemo();
	   
	   	do
	{
		System.out.println("\nArea calculator");
		System.out.print("\nMenu\n1.Rectangle\n2.Square\n3.Cirlce\n4.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:ob.readrect();
		break;
		case 2:ob.readsquare();
		break;
		case 3:ob.readcircle();
		break;
		case 4:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
	}
	}
	while(choice!=5);
	}
}
