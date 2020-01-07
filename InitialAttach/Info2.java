import java.io.Serializable;

public class Info2 implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public String name;

public Info2(String name) {
this.name = name;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Info2 obj= (Info2) o;
if (name!=obj.name) return false;
return true;
}
public String toString() {
return "Name = " + getName();
}
}