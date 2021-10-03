import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Console
{

	public static void main(String[] args)
	{

		try
 {

			FileWriter fw = new FileWriter("file.txt");
			fw.write("SNGCE IS A ENGINEERING COLLEGE.\n");
			fw.write("Provided withlot of enginneering courses.\n");
			fw.write("MCA is also there with another engineering courses.\n");
			fw.write("This college is linked with lot of multinational companies.");
		        fw.close();
			FileReader fr = new FileReader("file.txt");
			String str = "";
                        int i;
			while ((i = fr.read()) != -1)
	    {
                      str += (char)i;
            }
            System.out.println(str);
            fr.close();

		}

		catch (IOException e) 
{

			System.out.println
				("There are some IOException");
		}
	}
}
