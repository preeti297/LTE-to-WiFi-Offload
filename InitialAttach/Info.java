import java.io.Serializable;

public class Info implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int id;
public int dcbd;
public int sfn;

public Info(int id,int dcbd,int sfn ) {
this.id = id;
this.dcbd= dcbd;
this.sfn=sfn;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int getdcbd() {
return dcbd;
}

public void setdcbd(int dcbd) {
this.dcbd = dcbd;
}
public int getsfn() {
return sfn;
}

public void setsfn(int sfn) {
this.sfn = sfn;
}

public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Info ele = (Info) o;

if (id != ele.id) return false;
if(dcbd!=ele.dcbd) return false;
if(sfn!=ele.sfn) return false;
return true;
}

public int hashCode() {
return id;
}
/*public int hashCode() {
return dcbd;
}
public Float hashCode() {
return sfn;
}*/

public String toString() {
return "Id = " + getId() + " ;dcbd = " + getdcbd() + " ;sfn="+ getsfn();
}
}