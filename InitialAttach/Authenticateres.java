import java.io.Serializable;

public class Authenticateres implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int len;
public String res; 

public Authenticateres(int id,int len,String res) {
this.id=id;
this.len = len;
this.res= res;
}
public int getid() {
return id;
}

public void setid(int id) {
this.id = id;
}
public int getLen() {
return len;
}

public void setLen(int len) {
this.len = len;
}

public String getRes() {
return res;
}

public void setRes(String res) {
this.res = res;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Authenticateres ele = (Authenticateres) o;
if (id != ele.id) return false;
if (len != ele.len) return false;
if(res!=ele.res) return false;
return true;
}

public String toString() {
return "Id = " + getid() + ";LENGTH = " + getLen() + " ;AUTHENTICATION RESPONSE = " + getRes();
}
}