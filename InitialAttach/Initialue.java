
import java.io.Serializable;

public class Initialue implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int eusid;
public int id;
public int cid;
public int cam;

public Initialue(int id,int eusid,int cid,int cam ) {
this.eusid = eusid;
this.cid= cid;
this.cam=cam;
this.id=id;
}
public int getid() {
return id;
}

public void setId(int id) {
this.id = id;
}


public int getEusid() {
return eusid;
}

public void setEusid(int eusid) {
this.eusid = eusid;
}

public int getCid() {
return cid;
}

public void setCid(int cid) {
this.cid = cid;
}
public int getCam() {
return cam;
}

public void setCam(int cam) {
this.cam = cam;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Initialue ele = (Initialue) o;

if (eusid != ele.eusid) return false;
if(cid!=ele.cid) return false;
if(cam!=ele.cam) return false;
return true;
}

public String toString() {
return " id="+ getid()+";ENB UE S1AP ID = " + getEusid() + " ;CGI ID = " + getCid() + " ;CELL ACCESS MODE="+ getCam();
}
}