import java.io.Serializable;

public class S1apicr implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int musid;
public int eusid;

public S1apicr(int id,int musid,int eusid) {
this.id=id;
this.musid = musid;
this.eusid= eusid;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}

public int getMusid() {
return musid;
}

public void setMusid(int musid) {
this.musid = musid;
}

public int getEusid() {
return eusid;
}

public void setEusid(int eusid) {
this.eusid = eusid;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

S1apicr ele = (S1apicr) o;
if (id != ele.id) return false;
if (musid != ele.musid) return false;
if(eusid!=ele.eusid) return false;
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
return " ID = " + getid() +";MME UE SETUP ID = " + getMusid() + " ;ENODE UE SETUP ID = " + getEusid();
}
}