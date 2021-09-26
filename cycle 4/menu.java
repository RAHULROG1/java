import java.util.*;
class Interface extends Thread
{
	public synchronized void run()
{
        for(int i=0;i<10;i++)
{
            System.out.println("F1");
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class Main implements Runnable
{
    public synchronized void run()
	{
        for(int i=0;i<10;i++)
		{
            System.out.println("Football");
            try 
			{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

public class Menu
 {

	public static void main(String[] args) 
{
		Scanner scan = new Scanner(System.in);
		Interface d1=new Interface();
		Main d2=new Main();
		Thread t1=new Thread(d2);
		System.out.println("\nMenu driven code\n");

		while(true){
			System.out.println("To print F1, Enter value 1");
			System.out.println("To print Football, Enter value 2");
			System.out.println("To Exit, Enter value 3");
			
			System.out.print("\nEnter your choice:");
			int choice = scan.nextInt();

			switch(choice){
			case 1: d1.start();
					try 
{
                    Thread.sleep(1000);
                   }catch (Exception e){}
			break;
			case 2: t1.start();
					try 
{
					d1.join();
					t1.join();
					}catch (Exception e){}
			break;
			case 3: System.out.println("Exiting");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from menu");
			}
		}

	}

}
