import java.io.Serializable;

public class S1apreq implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
private int gnbid;
public String enbname;
public int sta;

public S1apreq(int id,int gnbid,String enbname,int sta ) {
this.id=id;
this.gnbid = gnbid;
this.enbname= enbname;
this.sta=sta;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}
public int getgnbId() {
return gnbid;
}

public void setgnbId(int gnbid) {
this.gnbid = gnbid;
}

public String getEnbname() {
return enbname;
}

public void setEnbname(String enbname) {
this.enbname = enbname;
}
public int getsta() {
return sta;
}

public void setsta(int sta) {
this.sta = sta;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

S1apreq ele = (S1apreq) o;
if (id != ele.id) return false;
if (gnbid != ele.gnbid) return false;
if(enbname!=ele.enbname) return false;
if(sta!=ele.sta) return false;
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
return " ID = " + getid() +";Global ENB Id = " + getgnbId() + " ;ENB name = " + getEnbname() + " ;Supported TAs="+ getsta();
}
}