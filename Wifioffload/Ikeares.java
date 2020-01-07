import java.io.Serializable;

public class Ikeares implements Serializable {

private static final long serialVersionUID = 5950169519310163576L;

public String eap_gtc;
public Ikeares(String eap_gtc) {
this.eap_gtc = eap_gtc;
}

public String getEap() {
return eap_gtc;
}

public void setEap(String eap_gtc) {
this.eap_gtc = eap_gtc;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Ikeares obj= (Ikeares) o;
if (eap_gtc!=obj.eap_gtc)return false;
return true;
}
public String toString() {
return "Eap_gtc = " + getEap();
}
}
