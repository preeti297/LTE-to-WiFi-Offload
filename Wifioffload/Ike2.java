import java.io.Serializable;

public class Ike2 implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int idi;

public Ike2(int idi ) {
this.idi= idi;
}
public int getidi() {
return idi;
}

public void setidi(int idi) {
this.idi = idi;
}
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Ike2 ele = (Ike2) o;

if (idi != ele.idi) return false;
return true;
}

public String toString() {
return "idi = " + getidi();
}
}