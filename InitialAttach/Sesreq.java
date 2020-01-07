import java.io.Serializable;

public class Sesreq implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
private int imsi;
public int msisdn;
public int mei;

public Sesreq(int id,int imsi,int msisdn,int mei) {
this.id=id;
this.imsi = imsi;
this.msisdn= msisdn;
this.mei=mei;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}
public int getImsi() {
return imsi;
}

public void setImsi(int imsi) {
this.imsi = imsi;
}

public int getMsisdn() {
return msisdn;
}

public void setMsisdn(int msisdn) {
this.msisdn = msisdn;
}
public int getMei() {
return mei;
}

public void setMei(int mei) {
this.mei = mei;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Sesreq ele = (Sesreq) o;
if (id != ele.id) return false;
if (imsi != ele.imsi) return false;
if(msisdn!=ele.msisdn) return false;
if(mei!=ele.mei) return false;
return true;
}

/*public int hashCode() {
return id;
}*/
/*public int hashCode() {
return dcbd;
}
public Float hashCode() {
return sfn;
}*/

public String toString() {
return "ID= " + getid() +" ;IMSI= " + getImsi() + " ;MSISDN= " + getMsisdn() + " ; MEI="+ getMei();
}
}