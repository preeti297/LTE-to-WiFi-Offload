import java.io.Serializable;

public class Rrcin2 implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int tiden;
public int plmniden;

public Rrcin2(int id,int tiden,int plmniden) {
this.id = id;
this.tiden =tiden ;
this.plmniden=plmniden;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int gettiden() {
return tiden;
}

public void settiden(int tiden) {
this.tiden = tiden;
}
public int getplmniden() {
return plmniden;
}

public void setplmniden(int plmniden) {
this.plmniden = plmniden;
}

public boolean equals(Object e) {
if (this == e) return true;
if (e == null || getClass() != e.getClass()) return false;

Rrcin2 ele= (Rrcin2) e;

if (id != ele.id) return false;
if (tiden!=ele.tiden)  return false;
if(plmniden!=ele.plmniden) return false;

return true;
}

public int hashCode() {
return id;
}

public String toString() {
return "Id = " + getId() + " ; tiden = " + gettiden()+";plmniden="+getplmniden();
}
}