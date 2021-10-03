import java.io.*;
import java.net.Socket;
import java.util.Scanner;
 class Client
 {
    public static void main(String[] args) {

        Socket socket=null;
        InputStreamReader inputstreamreader=null;
        OutputStreamWriter outputstreamwriter=null;
        BufferedReader bufferedreader=null;
        BufferedWriter bufferedwriter=null;

        try
        {
            socket=new Socket("localhost",1234);

            inputstreamreader=new InputStreamReader(socket.getInputStream());
            outputstreamwriter=new OutputStreamWriter(socket.getOutputStream());

            bufferedreader=new BufferedReader(inputstreamreader);
            bufferedwriter=new BufferedWriter(outputstreamwriter);

            Scanner sc=new Scanner(System.in);

            while(true)
            {
                System.out.print("Enter the message: ");
                String msg=sc.nextLine();

                bufferedwriter.write(msg);
                bufferedwriter.newLine();
                bufferedwriter.flush();

              

                if(msg.equalsIgnoreCase("Stop"))
                    break;
               }
           }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    try{
                        if(socket!=null)
                            socket.close();
                        if(inputstreamreader!=null)
                            inputstreamreader.close();
                        if(outputstreamwriter!=null)
                            outputstreamwriter.close();
                        if(bufferedreader!=null)
                            bufferedreader.close();
                        if(bufferedwriter!=null)
                            bufferedwriter.close();
                    }
                    catch(IOException e)
                    {
                    e.printStackTrace();
                }
                }
            }
        }