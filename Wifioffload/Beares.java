import java.io.Serializable;

public class Beares implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int mfc;
public int sfc;
public int efc;

public Beares(int mfc,int sfc,int efc) {
this.mfc = mfc;
this.sfc= sfc;
this.efc=efc;
}
public int getMfc() {
return mfc;
}

public void setMfc(int mfc) {
this.mfc = mfc;
}

public int getSfc() {
return sfc;
}

public void setSfc(int sfc) {
this.sfc = sfc;
}
public int getEfc() {
return efc;
}

public void setEfc(int efc) {
this.efc = efc;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Beares ele = (Beares) o;

if (mfc != ele.mfc) return false;
if(sfc!=ele.sfc) return false;
if(efc!=ele.efc) return false;
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
return "MME FQ CSID= " + getMfc() + " ;SGW FQ CSID= " + getSfc() + " ; EPDG FQ CSID="+ getEfc();
}
}