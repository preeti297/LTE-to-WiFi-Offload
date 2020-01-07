import java.io.Serializable;

public class Rrcc implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int id;
public int srb;
public int eps;
public int drb;
public String msg;


public Rrcc(int id,int srb,int eps,int drb,String msg) {
this.id = id;
this.srb= srb;
this.eps=eps;
this.drb=drb;
this.msg=msg;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int getsrb() {
return srb;
}

public void setsrb(int srb) {
this.srb = srb;
}
public int geteps() {
return eps;
}

public void seteps(int eps) {
this.eps = eps;
}
public int getdrb() {
return drb;
}

public void setsfn(int drb) {
this.drb =drb;
}
public String getmsg() {
return msg;
}

public void setmsg(String msg) {
this.msg = msg;
}


public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Rrcc ele = (Rrcc) o;

if (id != ele.id) return false;
if(srb!=ele.srb) return false;
if(eps!=ele.eps) return false;
if(drb!=ele.drb) return false;
return true;
}

public int hashCode() {
return id;
}


public String toString() {
return "Id = " + getId() + " ;srb = " + getsrb() + " ;eps="+ geteps()+";drb="+getdrb()+";msg="+getmsg();
}
}