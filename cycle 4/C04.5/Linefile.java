import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class File {

  public static void main(String[] args)
  {

    try 
{

      FileReader fr = new FileReader("one.txt");
      FileWriter fw = new FileWriter("two.txt");
      String str = "";

      int i;
      while ((i = fr.read()) != -1)
 {

        str += (char)i;
      }
      fw.write(str);
      fr.close();
      fw.close();
    }
    catch (IOException e) 
    {
      System.out.println("There are some IOException");
    }
  }
}