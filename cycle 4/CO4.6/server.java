import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

 class Server
 {
    public static void main(String[] args) throws Exception {

        Socket socket=null;
        ServerSocket serversocket=null;
        InputStreamReader inputstreamreader=null;
        OutputStreamWriter outputstreamwriter=null;
        BufferedReader bufferedreader=null;
        BufferedWriter bufferedwriter=null;


        serversocket=new ServerSocket(1234);
        System.out.println("Server Started");
        System.out.println("Waiting for client to be connected");

        while(true)
        {

        try
        {
            socket=serversocket.accept();
            System.out.println("Client Connected");

            inputstreamreader=new InputStreamReader(socket.getInputStream());
            outputstreamwriter=new OutputStreamWriter(socket.getOutputStream());

            bufferedreader=new BufferedReader(inputstreamreader);
            bufferedwriter=new BufferedWriter(outputstreamwriter);

            

            while(true)
            {

                String msg=bufferedreader.readLine();

                System.out.println("Client message: "+msg);

                if(msg.equalsIgnoreCase("stop"))
                break;
            }
            System.out.println("Connection Closed");
            System.exit(0);

        socket.close();
        inputstreamreader.close();
        outputstreamwriter.close();
        bufferedreader.close();
        bufferedwriter.close();
    }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }
 }