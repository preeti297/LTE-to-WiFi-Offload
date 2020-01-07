import java.io.Serializable;

public class Ikeat implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;

public String Hdr;
public int uid;
public int apn;
public String confpd;
public Ikeat(String Hdr,int uid,int apn,String confpd) {
this.Hdr = Hdr;
this.uid = uid;
this.apn = apn;
this.confpd = confpd;
}

public String getHdr() {
return Hdr;
}

public void setHdr(String Hdr) {
this.Hdr = Hdr;
}
public int getuid() {
return uid;
}

public void setuid(int uid) {
this.uid = uid;
}

public int getapn() {
return apn;
}

public void setapn(int apn) {
this.apn= apn;
}
public String getconfpd() {
return confpd;
}

public void setconfpd(String confpd) {
this.confpd = confpd;
}
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Ikeat obj= (Ikeat) o;
if (Hdr!=obj.Hdr)return false;
if (uid!=obj.uid)return false;
if (apn!=obj.apn) return false;
if (confpd!=obj.confpd)return false;
return true;
}
public String toString() {
return "key = " + getHdr() +";uid =" +getuid()+";apn=" +getapn()+";confpd="+getconfpd();
}
}
