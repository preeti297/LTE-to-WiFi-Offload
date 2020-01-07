import java.io.Serializable;

public class Beareq implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int pti;
public int sfc;
public int pfc;

public Beareq(int pti,int sfc,int pfc) {
this.pti = pti;
this.sfc= sfc;
this.pfc=pfc;
}
public int getPti() {
return pti;
}

public void setPti(int pti) {
this.pti = pti;
}

public int getSfc() {
return sfc;
}

public void setSfc(int sfc) {
this.sfc = sfc;
}
public int getPfc() {
return pfc;
}

public void setPfc(int pfc) {
this.pfc = pfc;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Beareq ele = (Beareq) o;

if (pti != ele.pti) return false;
if(pfc!=ele.pfc) return false;
if(sfc!=ele.sfc) return false;
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
return "PROCEDURE TRANSACTION ID= " + getPti() + " ;PGW FQ CSID= " + getPfc() + " ; SGW FQ CSID="+ getSfc();
}
}