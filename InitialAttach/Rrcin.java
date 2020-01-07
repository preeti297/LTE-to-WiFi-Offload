import java.io.Serializable;

public class Rrcin implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int tmsi;
public int ranval;

public Rrcin(int id,int tmsi,int ranval) {
this.id = id;
this.tmsi =tmsi ;
this.ranval=ranval;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int gettmsi() {
return tmsi;
}

public void settmsi(int tmsi) {
this.tmsi = tmsi;
}
public int getranval() {
return ranval;
}

public void setranval(int ranval) {
this.ranval= ranval;
}

public boolean equals(Object e) {
if (this == e) return true;
if (e == null || getClass() != e.getClass()) return false;

Rrcin ele= (Rrcin) e;

if (id != ele.id) return false;
if (tmsi!=ele.tmsi)  return false;
if(ranval!=ele.ranval) return false;

return true;
}

public int hashCode() {
return id;
}

public String toString() {
return "Id = " + getId() + " ; tmsi = " + gettmsi()+";ranval="+getranval();
}
}