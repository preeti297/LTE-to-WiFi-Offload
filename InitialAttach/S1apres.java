import java.io.Serializable;

public class S1apres implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
private String mmename;
public int rmc;
public int mrsi;

public S1apres(int id,String mmename,int rmc,int mrsi) {
this.id=id;
this.mmename = mmename;
this.rmc= rmc;
this.mrsi=mrsi;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}

public int getrmc() {
return rmc;
}

public void setrmc(int rmc) {
this.rmc = rmc;
}

public String getmmename() {
return mmename;
}

public void setmmename(String mmename) {
this.mmename = mmename;
}
public int getmrsi() {
return mrsi;
}

public void setsta(int mrsi) {
this.mrsi = mrsi;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

S1apres ele = (S1apres) o;
if (id != ele.id) return false;
if (rmc != ele.rmc) return false;
if(mmename!=ele.mmename) return false;
if(mrsi!=ele.mrsi) return false;
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
return "ID = " + getid() + "MME NAME = " + getmmename() + " ;RELATIVE MME CAPACITY = " + getrmc() + " ; MME RELAY SUPPORT INDICATOR="+ getmrsi();
}
}