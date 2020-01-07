import java.io.*;  
import java.net.*;  
public class Mme {  
public static void main(String[] args){  
try{  
Socket s=new Socket("localhost",6667);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("s1ap setup starting");  
dout.flush();  
dout.close();  
s.close();  
} catch(Exception e){System.out.println(e);} 
} 
} 