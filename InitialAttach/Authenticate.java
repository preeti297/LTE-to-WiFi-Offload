import java.io.Serializable;

public class Authenticate implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int amf;
public String ak;
public String asme; 
public String mac;
public int rand;
public int sqn; 

public Authenticate(int id,int amf,String ak ,String asme ,String mac ,int rand,int sqn ) {
this.id=id;
this.amf = amf;
this.ak= ak;
this.asme=asme;
this.mac = mac;
this.rand= rand;
this.sqn=sqn;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}


public int getAmf() {
return amf;
}

public void setAmf(int amf) {
this.amf = amf;
}

public String getAk() {
return ak;
}

public void setAk(String Ak) {
this.ak = ak;
}
public String getAsme() {
return asme;
}

public void setAsme(String asme) {
this.asme = asme;
}

public String getMac() {
return mac;
}

public void setMac(String mac) {
this.mac = mac;
}

public int getRand() {
return rand;
}

public void setRand(int rand) {
this.rand = rand;
}
public int getSqn() {
return sqn;
}

public void setSqn(int sqn) {
this.sqn = sqn;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Authenticate ele = (Authenticate) o;

if (id != ele.id) return false;
if (amf != ele.amf) return false;
if(ak!=ele.ak) return false;
if(asme!=ele.asme) return false;
if (mac != ele.mac) return false;
if(rand!=ele.rand) return false;
if(sqn!=ele.sqn) return false;
return true;
}

public String toString() {
return "ID = " + getid() +";AUTHENTICATION MANAGEMENT FIELD = " + getAmf() + " ;ANONYMITY KEY = " + getAk() + " ;ACCESS SECURITY MANAGEMENT ENTITY="+ getAsme()+"MESSAGE AUTHENTICATION CODE = " + getMac() + " ;RANDOM NUMBER = " + getRand() + " ;SEQUENCE NUMBER="+ getSqn();
}
}