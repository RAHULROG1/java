import java.io.*;
import java.util.*;


class File 
{
  String fname;

  void read()
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the filename");
      fname=sc.next(); 
  }
  
  void check() throws Exception
  {
    
    FileInputStream file = new FileInputStream(fname);
    FileOutputStream evenFile = new FileOutputStream("EvenFile.txt");
    FileOutputStream oddFile = new FileOutputStream("OddFile.txt");

    int i=0;
    while((i=file.read())!=-1) 
     {
      if(i%2==0)
      {
      evenFile.write(i);
     }
      else
      oddFile.write(i);
     }
      file.close();
     evenFile.close();
     oddFile.close();
  }

}
 class Main 
{
  public static void main(String[] args) throws Exception
  { 
      File f=new File();
      f.read();
      f.check();
      }

    } 
