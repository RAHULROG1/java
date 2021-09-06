import java.util.*;
class Investment
{
	void dispIntrest(double time,double amount)
	{
		double federal=(amount*time*8.4)/100;
		System.out.println("Intrest amount in Federal "+federal);	
		double karur=(amount*time*7.3)/100;
		System.out.println("Intrest amount in Karur "+karur);	
		double boi=(amount*time*9.7)/100;
		System.out.println("Intrest amount in Bank of India "+boi);	
	}
}
class Main
{
	public static void main(String args[])
	{
	double time,amount;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the initial investment:");
	amount=sc.nextLong();
	System.out.print("Enter the time period:");
	time=sc.nextDouble();
	Investment inv=new Investment();	
	inv.dispIntrest(amount,time);
	}
}