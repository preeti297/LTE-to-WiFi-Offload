import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.SocketException;
import java.io.Serializable;
/*
 * A chat server that delivers public and private messages.
 */
public class Multiser{

  // The server socket.
  private static ServerSocket serverSocket = null;
  // The client socket.
  private static Socket clientSocket = null;

  // This server can accept up to maxClientsCount clients' connections.
  private static final int maxClientsCount = 10;
  private static final clientThread[] threads = new clientThread[maxClientsCount];

  public static void main(String args[]) {

    // The default port number.
    int portNumber = 2234;
    if (args.length < 1) {
      System.out.println("Usage: java MultiThreadChatServerSync <portNumber>\n"
          + "Now using port number=" + portNumber);
    } else {
      portNumber = Integer.valueOf(args[0]).intValue();
    }

    /*
     * Open a server socket on the portNumber (default 2222). Note that we can
     * not choose a port less than 1023 if we are not privileged users (root).
     */
    try {
      serverSocket = new ServerSocket(portNumber);
    } catch (Exception e) {
      System.out.println(e);
    }

    /*
     * Create a client socket for each connection and pass it to a new client
     * thread.
     */
    while (true) {
      try {
        clientSocket = serverSocket.accept();
        int i=0;
        for (i = 0; i < maxClientsCount; i++) {
          if (threads[i] == null) {
            (threads[i] = new clientThread(clientSocket, threads)).start();
              break;

          }
        }
        if (i == maxClientsCount) {
          PrintStream os = new PrintStream(clientSocket.getOutputStream());
          os.println("Server too busy. Try later.");
          os.close();
          clientSocket.close();
        }
      } catch (Exception e) {
	e.printStackTrace();
        //System.out.println(e);
      }
    }
  }
}

class clientThread extends Thread {

  private String clientName = null;
  private Socket clientSocket = null;
  private final clientThread[] threads;
  private int maxClientsCount;


  public clientThread(Socket clientSocket, clientThread[] threads) {
    this.clientSocket = clientSocket;
    this.threads = threads;
    maxClientsCount = threads.length;
  }

  public void run() {
    int maxClientsCount = this.maxClientsCount;
    clientThread[] threads = this.threads;

    try {
      /*
       * Create input and output streams for this client.
       */
      ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
      ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
     
try{
Info2 obj2=(Info2) ois.readObject();
System.out.println(obj2.name.toUpperCase()+" IS CONNECTED TO SERVER:");
if((obj2.name).equals("ue"))
{
Info ele=new Info(1,3434,5653);
Sib s=new Sib(1,2,3,4,5,6,7,8,9,10,11,12,13);
oos.writeObject(ele);
oos.writeObject(s);
Rrcin robj=(Rrcin) ois.readObject();
Rrcin2 robj2 =new Rrcin2(3,6547,3458);
oos.writeObject(robj2);
Scm sobj=new Scm(4,0000,0001,0010,0000,0001,0010,"cmd");
oos.writeObject(sobj);
Scm sobj1=(Scm)ois.readObject();
Rrcc rcob=new Rrcc(5,2,9,31,"RRCconfig");
oos.writeObject(rcob);
Rrcc rcob1=(Rrcc)ois.readObject();
System.out.println("To Client");
System.out.println("Object to be written = " + ele);
Thread.sleep(3000);
System.out.println("Object to be written = " + s);
Thread.sleep(3000); 
System.out.println("RRC CONNECTION REQUEST:");
System.out.println(robj);
Thread.sleep(3000);
System.out.println("RRC CONNECTION SETUP:");
Thread.sleep(3000);
System.out.println("RRC CONNECTION COMPLETE:");
Thread.sleep(3000);
System.out.println("SECURITY MODE COMMAND:");
Thread.sleep(3000);
System.out.println("SECURITY MODE COMPLETE:");
System.out.println(sobj1.msg);
Thread.sleep(3000);
System.out.println(rcob1.msg);

}if((obj2.name).equals("mme")){
S1apreq req=new S1apreq(5,456,"Node1",34);
oos.writeObject(req);
S1apres res=(S1apres)ois.readObject();
Initialue i=new Initialue(7,5678,467,1);
oos.writeObject(i);
Authenticate a=new Authenticate(8,5555,"6e323b36","346","a3df0e6e",89,189);
oos.writeObject(a);
Authenticateres a1=(Authenticateres)ois.readObject();
S1apic ic=(S1apic)ois.readObject();
S1apicr icr=new S1apicr(11,5555,7890);
oos.writeObject(icr);
System.out.println("S1AP CONNECTION REQUEST SENDING:");
Thread.sleep(3000);
System.out.println("S1AP CONNECTION RESPONSE RECEIVED");
System.out.println(res);
Thread.sleep(3000);
System.out.println("INITIAL UE MESSAGE");
Thread.sleep(3000);
System.out.println("AUTHENTICATION REQUEST");
Thread.sleep(3000);
System.out.println("AUTHENTICATION RESPONSE RECEIVED");
System.out.println(a1);
Thread.sleep(3000);
System.out.println("S1AP INITIAL CONTEXT REQUEST RECEIVED");
System.out.println(ic);
Thread.sleep(3000);
System.out.println("S1AP INITIAL CONTEXT RESPONSE SENDING ");
}
}catch(Exception e)
{
e.printStackTrace();
}

synchronized (this) {
for (int i = 0; i < maxClientsCount; i++) {
     if (threads[i] == this) {
            threads[i] = null;
          }
        }
      }

      ois.close();
      oos.close();
      clientSocket.close();
} catch (Exception e) {
e.printStackTrace();
//System.out.println(e);
}
}
}