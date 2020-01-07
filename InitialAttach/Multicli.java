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
public class Multicli implements Runnable {

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
    int portNumber = 2234;
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
         new Thread(new Multicli()).start();
        while(!closed){
        Info2 obj1=new Info2 (name);
        obj1.name=name;
        oos.writeObject(obj1);
        if((obj1.name).equals("ue"))
        {
        Info ele1 = (Info) ois.readObject();
         Sib s1=(Sib)ois.readObject();
         Rrcin robj =new Rrcin(7,4568,9870);
         oos.writeObject(robj);
         Rrcin2 robj2=(Rrcin2)ois.readObject();
         Scm sobj=(Scm)ois.readObject();
         String msg="Security mode Complete";
         sobj.msg=msg;
         Scm sobj1=new Scm(6,0000,0001,0010,0000,0001,0010,msg);
         oos.writeObject(sobj1);
         Rrcc rcob=(Rrcc)ois.readObject();
         String msg1="RRC connection reconfiguration Complete";
         rcob.msg=msg1;
         Rrcc rcob1=new Rrcc(5,2,9,31,msg1);    
         oos.writeObject(rcob1);   
         Thread.sleep(3000);
         System.out.println("MIB is Received "+ele1);
         Thread.sleep(3000);
         System.out.println("SIB is Recieved");
         System.out.println("SIB1 :");
         System.out.println("CELL ID :"+s1.id+"PLMN :"+s1.plmn+"TAC :"+s1.tac);
         System.out.println("SIB2 :");
         System.out.println("UPLINK CARRIER FREQUENCY :"+s1.ucf+"BANDWIDTH :"+s1.bw);
         System.out.println("SIB3 :");
         System.out.println("SF MEDIUM :"+s1.sfm+"SF HIGH :"+s1.sfh);
         System.out.println("SIB4 :");
         System.out.println("PHYSICAL CELL IDENTITY :"+s1.pci+"QOFFSET :"+s1.qos+"START :"+s1.s);
         System.out.println("SIB5 :");
         Thread.sleep(3000);
         System.out.println("DOWNLINK CARRIER FREQUENCY :"+s1.dcf+"QRCLEVMIN :"+s1.qmin+"PMAX :"+s1.pmax);  
         Thread.sleep(3000);
         System.out.println("RRC CONNECTION REQUESTED");
         System.out.println(robj2); 
         Thread.sleep(3000);
         System.out.println("SECURITY COMMAND MODE");
         System.out.println("INTEGRITY ALGORITHMS:");
         System.out.println(sobj.EIA0+" Null Integrity Protection algorithm");
         System.out.println(sobj.EIA1+"128-EIA1 SNOW 3G");
         System.out.println(sobj.EIA2+"128-EIA2 AES");
         System.out.println("CIPHERING ALGORITHMS:"); 
         Thread.sleep(3000);
         System.out.println(sobj.EIA0+"EIA0 Null Integrity Protection Algorithm");
         System.out.println (sobj.EEA0+" EEA0 Null ciphering algorithm");
         System.out.println(sobj.EEA1+"128-EEA1 SNOW 3G based algorithm");
         System.out.println(sobj.EEA2+"128-EEA2 AES based algorithm");
         Thread.sleep(3000);
         System.out.println("RRC CONNECTION RECONFIGURATION"+"\n"+rcob); 
         } 
        if((obj1.name).equals("mme"))
         {
          System.out.println("S1ap Request Received");
          S1apreq r=(S1apreq)ois.readObject();
          S1apres r1=new S1apres(6,"MME1",123,1);
          oos.writeObject(r1);
          Initialue i=(Initialue)ois.readObject();
          Authenticate a=(Authenticate)ois.readObject();
          Authenticateres a1=new Authenticateres(9,9,"34erbfhg7");
          oos.writeObject(a1);
          S1apic ic=new S1apic(10,2367,9078,"34erbfhg7");
          oos.writeObject(ic);
          S1apicr icr=(S1apicr)ois.readObject();
          System.out.println(r);
          Thread.sleep(3000);
          System.out.println("S1ap Response Sending");
          Thread.sleep(3000);
          System.out.println("Initial ue message Received");
          System.out.println(i);
          Thread.sleep(3000);
          System.out.println("Authentication Request Received");
          System.out.println(a);
          Thread.sleep(3000);
          System.out.println("Authentication  Response Sending");
          Thread.sleep(3000);
          System.out.println("S1ap initial context setup message Sending");
          Thread.sleep(3000);
          System.out.println("S1ap initial context setup message Received");
          System.out.println(icr);          
          }
         }
        ois.close();
        oos.close();
        clientSocket.close();
              
       
      } catch (Exception e) {
        e.printStackTrace();
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