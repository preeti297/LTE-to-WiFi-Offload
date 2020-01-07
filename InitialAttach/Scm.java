


import java.io.Serializable;

public class Scm implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int id;
public int EIA0;
public int EIA1;
public int EIA2;
public int EEA0;
public int EEA1;
public int EEA2;
public String msg;
public Scm(int id,int EIA0,int EIA1,int EIA2,int EEA0,int EEA1,int EEA2,String msg) {
this.id = id;
this.EIA0= EIA0;
this.EIA1=EIA1;
this.EIA2=EIA2;
this.EEA0=EEA0;
this.EEA1=EEA1;
this.EEA2=EEA2;
this.msg=msg;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}
public String getmsg() {
return msg;
}

public void setmsg(String msg) {
this.msg = msg;
}

public int getEIA0() {
return EIA0;
}

public void setEIA0(int EIA0) {
this.EIA0= EIA0;
}
public int getEIA1() {
return EIA1;
}
public void setEIA1(int EIA1) {
this.EIA1 = EIA1;
}
public int getEIA2() {
return EIA2;
}
public void setEIA2(int EIA2) {
this.EIA2 = EIA2;
}
public int getEEA0() {
return EEA0;
}
public void setEEA0(int EEA0) {
this.EEA0 = EEA0;
}
public int getEEA1() {
return EEA1;
}
public void setEEA1(int EEA1) {
this.EEA1 = EEA1;
}
public int getEEA2() {
return EEA2;
}
public void setEEA2(int EEA2) {
this.EEA2= EEA2;
}


public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Scm ele = (Scm) o;

if (id != ele.id) return false;
if(EIA0!=ele.EIA0) return false;
if(EIA1!=ele.EIA1) return false;
if(EIA2!=ele.EIA2) return false;
if(EEA0!=ele.EEA0) return false;
if(EEA1!=ele.EEA1) return false;
if(EEA2!=ele.EEA2) return false;
return true;
}

public int hashCode() {
return id;
}


public String toString() {
return "Id = " + getId() + " ;EIA0 = " + getEIA0() + " ;EIA1="+ getEIA1()+";EIA2="+ getEIA2()+";EEA0="+ getEEA0()+";EEA1="+ getEEA1()+";EEA2="+getEEA2()+";msg="+getmsg();
}
}