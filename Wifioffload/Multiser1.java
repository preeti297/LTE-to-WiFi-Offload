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
public class Multiser1{

  // The server socket.
  private static ServerSocket serverSocket = null;
  // The client socket.
  private static Socket clientSocket = null;

  // This server can accept up to maxClientsCount clients' connections.
  private static final int maxClientsCount = 10;
  private static final clientThread[] threads = new clientThread[maxClientsCount];

  public static void main(String args[]) {

    // The default port number.
    int portNumber = 4444;
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
Ike iobj=(Ike) ois.readObject();
System.out.println(iobj);
iobj.msg="MULTIPLE AUTHENTICATION SUPPORTED";
oos.writeObject(iobj);
Ikeat iobj1=(Ikeat) ois.readObject();
System.out.println(iobj1);
System.out.println("ANOTHER AUTHENTICATION REQUEST:");
Ikeat iobj3=(Ikeat) ois.readObject();
System.out.println(iobj3);
iobj3.confpd="AUTH RESPONSE FROM EPDG";
oos.writeObject(iobj3);
Ike2 iobj6=(Ike2)ois.readObject();
System.out.println("IKE AUTH REQUEST[IDi]"+iobj6);
System.out.println("ANOTHER AUTHENTICATION RESPONSE");
Ikeares ik=new Ikeares("EAP_GTC Request");
oos.writeObject(ik);
Ikeares ik1=(Ikeares) ois.readObject();
System.out.println(ik1);
System.out.println("ANOTHER AUTHENTICATION RESPONSE");
Ikeares ik2=new Ikeares("EAP_GTC SUCCESS");
oos.writeObject(ik2);
Ikeaf ik3=(Ikeaf) ois.readObject();
System.out.println(ik3.msg);
System.out.println("SENDING AUTHENTICATION RESPONSE");
Ikeaf ik4=new Ikeaf("RESPONSE","CONFIGURATION PAYLOAD");
oos.writeObject(ik4);
}
if((obj2.name).equals("pgw")){
System.out.println("SENDING SESSION REQUEST");
Sesreq sr=new Sesreq(1234,8975,789);
oos.writeObject(sr);
System.out.println("SESSION CREATION RESPONSE RECEIVED");
Sesres sr1=(Sesres)ois.readObject();
System.out.println(sr1);
System.out.println("BEARER REQUEST RECEIVED");
Beareq br1=(Beareq)ois.readObject();
System.out.println(br1);
System.out.println("BEARER CREATION RESPONSE SENDING ");
Beares br2=new Beares(5555,7890,9087);
oos.writeObject(br2);
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