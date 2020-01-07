import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Multicli1 implements Runnable {

  // The client socket
  private static Socket clientSocket = null;
  // The output stream
  private static PrintStream os = null;
  // The input stream
  private static DataInputStream is = null;
  private static boolean closed = false;
  private static ObjectInputStream ois=null;
  private static ObjectOutputStream oos=null;
  public static void main(String[] args) {

    // The default port.
    int portNumber = 4444;
    // The default host.
    String host = "localhost";
//     String name;

    if (args.length < 2) {
      System.out.println("Usage: java MultiThreadChatClient <host> <portNumber>\n"
              + "Now using host=" + host + ", portNumber=" + portNumber);
    } else {
      host = args[0];
      portNumber = Integer.valueOf(args[1]).intValue();
    }

    /*
     * Open a socket on a given host and port. Open input and output streams.
     */
    try{
      clientSocket = new Socket(host, portNumber);
      oos = new ObjectOutputStream(clientSocket.getOutputStream());
      ois = new ObjectInputStream(clientSocket.getInputStream());
            }catch(Exception e){
       System.out.println(e);
}
   
    /*
     * If everything has been initialized then we want to write some data to the
     * socket we have opened a connection to on the port portNumber.
     */
    if (clientSocket!= null) {
      try {
  System.out.println("enter name of client"); 
  Scanner sc =new Scanner(System.in);  
  String name=sc.nextLine();
  
  String name1=name.toUpperCase();
 System.out.println(name1+":");
  
          /* Create a thread to read from the server. */
        System.out.println("Going to start");
         new Thread(new Multicli1()).start();
        while(!closed){
        Info2 obj1=new Info2 (name);
        obj1.name=name;
        oos.writeObject(obj1);
        if((obj1.name).equals("ue"))
        { 
         System.out.println("IKE_SA_INIT REQUEST:");
         Ike ele4=new Ike("obcde132456","SecureConnection","Hashalg","Encalg","msg");
         oos.writeObject(ele4); 
         Ike ele=(Ike)ois.readObject();
         Ikeat iobj=new Ikeat("Header",22,3434,"Configuration protocol");
         oos.writeObject(iobj);
         Ikeat iobj2=new Ikeat("Header",22,3434,"ANOTHER_AUTH_FOLLOWS");
         oos.writeObject(iobj2); 
         Ikeat iobj4=(Ikeat)ois.readObject();
         Ike2 iobj5=new Ike2(212);
         oos.writeObject(iobj5);
         Ikeares ik=(Ikeares)ois.readObject();
         Ikeares ik1=new Ikeares("Eap_gtc Response");
         oos.writeObject(ik1); 
         Ikeares ik2=(Ikeares)ois.readObject();
         Ikeaf ik3=new Ikeaf("Request",null);
         oos.writeObject(ik3); 
         Ikeaf ik4=(Ikeaf)ois.readObject();
         System.out.println("FROM EPDG"+ele.msg);
         Thread.sleep(3000);
         System.out.println("IKE_AUTHENTICATION REQUEST:"); 
         Thread.sleep(3000);
         System.out.println(" ANOTHER REQUEST--------->"+"IKE_AUTHENTICATION REQUEST:");
          System.out.println(iobj4.confpd);
         Thread.sleep(3000);
         System.out.println(ik);
         Thread.sleep(3000);
         System.out.println("Response EAP_GTC");
         System.out.println(ik2);
         Thread.sleep(3000);
         System.out.println("Sending Another Authentication Request");
         System.out.println(ik4);
         } 
          if((obj1.name).equals("pgw"))
         {
          Sesreq sr=(Sesreq)ois.readObject();
          Sesres sr1=new Sesres(7896,12389,1657);
          oos.writeObject(sr1);
          Beareq br=new Beareq(3458,786,9087);
          oos.writeObject(br);
          Beares br2=(Beares)ois.readObject();
          System.out.println("Session Request Received");
          System.out.println(sr);
          Thread.sleep(3000);
          System.out.println("Session response Sending");
          Thread.sleep(3000);
          System.out.println("Bearer Creation Request");
          Thread.sleep(3000);
          System.out.println("Bearer creation response Received");
          System.out.println(br2);
          }
         }
        ois.close();
        oos.close();
        clientSocket.close();        
      } catch (Exception e) {
        System.err.println("IOException:  " + e);
      }
    }
  }

  /*
   * Create a thread to read from the server. (non-Javadoc)
   * 
   * @see java.lang.Runnable#run()
   */
  public void run() {
    try {
    
         closed=true;             
        /*
         * Close the output stream, close the input stream, close the socket.
         */
        
  
        
    } catch (Exception e) {
      System.err.println("IOException:  " + e);
    } 
  }
}