import java.io.Serializable;

public class Ikeaf implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;

public String msg;
public String confpd;
public Ikeaf(String msg,String confpd) {
this.msg = msg;
this.confpd = confpd;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public String getconfpd() {
return confpd;
}

public void setconfpd(String confpd) {
this.confpd = confpd;
}
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Ikeaf obj= (Ikeaf) o;
if (msg!=obj.msg)return false;
if (confpd!=obj.confpd)return false;
return true;
}
public String toString() {
return "Message = " + getMsg() +";confpd="+getconfpd();
}
}
