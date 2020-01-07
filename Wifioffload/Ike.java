import java.io.Serializable;

public class Ike implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;

public String key;
public String nonce;
public String Halg;
public String Encalg;
public String msg;
public Ike(String key,String nonce,String Halg,String Encalg,String msg) {
this.key = key;
this.nonce = nonce;
this.Halg = Halg;
this.Encalg = Encalg;
this.msg=msg;
}

public String getkey() {
return key;
}

public void setkey(String key) {
this.key = key;
}
public String getmsg() {
return msg;
}

public void setmsg(String msg) {
this.msg = msg;
}

public String getnonce() {
return nonce;
}

public void setnonce(String nonce) {
this.nonce= nonce;
}
public String getHalg() {
return Halg;
}

public void setHalg(String Halg) {
this.Halg = Halg;
}
public String getEncalg() {
return Encalg;
}

public void setName(String Encalg) {
this.Encalg = Encalg;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Ike obj= (Ike) o;
if (key!=obj.key)return false;
if (nonce!=obj.nonce)return false;
if (Halg!=obj.Halg) return false;
if (Encalg!=obj.Encalg)return false;
if (msg!=obj.msg) return false;
return true;
}
public String toString() {
return "key = " + getkey() +";nonce =" +getnonce()+";Halg=" +getHalg()+";Encalg="+getEncalg();
}
}