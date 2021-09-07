import java.util.Scanner;
interface order
{
  void order_det();
}
class product implements order 
{
  Scanner sc = new Scanner(System.in);
  int pid,quant,price,total,ord_no;
  String date,name;
   
public void order_det()
{
 System.out.println("\nEnter the product details:");
 System.out.println("Date:");
 date=sc.next();
 System.out.println("Order number:");
 ord_no=sc.nextInt();
 System.out.println("Product Id:");
 pid=sc.nextInt();
 System.out.println("Name:");
 name=sc.next();
 System.out.println("Quantity:");
 quant=sc.nextInt();
 System.out.println("Unit price:");
 price=sc.nextInt();
}

void display()
{ 
System.out.println("\nOrder number:"+ord_no);
System.out.println("DATE:"+date);
System.out.println("\nProductId ");
System.out.println("----------");
System.out.println(pid);
System.out.println("Name");
System.out.println("----------");
System.out.println(name);
System.out.println("Quantity");
System.out.println("----------");
System.out.println(quant);
System.out.println("price");
System.out.println("----------");
System.out.println(price);
System.out.println("\nTotal:"+(price*quant));
System.out.println("----------");
System.out.println("----------");
}
}
public class Bill
{ public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the limit:");
 int n=sc.nextInt();
 int sum=0;
 product p[]=new product[n];
 for (int i=0;i<n;i++)
 {
   p[i]= new product();
   p[i].order_det();
   p[i].display();
   sum+=p[i].price*p[i].quant;
 }
 System.out.println("\nGrand Total:"+sum);
 }
}