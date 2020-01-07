import java.io.Serializable;

public class S1apic implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
private int musid;
public int eusid;
public String sk;

public S1apic(int id,int musid,int eusid,String sk) {
this.id=id;
this.musid = musid;
this.eusid= eusid;
this.sk=sk;
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

public String getSk() {
return sk;
}

public void setSk(String sk) {
this.sk = sk;
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

S1apic ele = (S1apic) o;
if (id != ele.id) return false;
if (musid != ele.musid) return false;
if(eusid!=ele.eusid) return false;
if(sk!=ele.sk) return false;
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
return " ID = " + getid() +";MME UE SETUP ID = " + getMusid() + " ;ENODE UE SETUP ID = " + getEusid() + " ; SECURITY KEY="+ getSk();
}
}