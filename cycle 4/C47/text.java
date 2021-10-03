import java.util.*;
import java.io.*;
class Textfile
{
            public static void main(String args[])throws IOException
            {
                        int lines=1,words=0;           
                        char ch;
                        Scanner scr=new Scanner(System.in);
                        System.out.print("\nEnter File name: ");
                        String str=scr.nextLine();
                        FileInputStream f=new FileInputStream(str);
                        int n=f.available();
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)f.read();
                                    if(ch=='\n')
                                    lines++;
                                    else if(ch==' ')
                                                words++;
                                                                       
                        }
                        System.out.println("\nNum of lines : "+lines);
                        System.out.println("\nNum of words : "+(lines+words));
                        System.out.println("\nNum of characters : "+n);
                       

            }
}