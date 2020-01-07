import java.io.Serializable;

public class Sib implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
public int id;
public int plmn;
public int tac;
public int ucf;
public int bw;
public int sfm;
public int sfh;
public int pci;
public int qos;
public int s;
public int dcf;
public int qmin;
public int pmax;

public Sib(int id,int plmn,int tac,int ucf,int bw,int sfm,int sfh,int pci,int qos,int s,int dcf,int qmin,int pmax) {
this.id = id;
this.plmn= plmn;
this.tac=tac;
this.ucf = ucf;
this.bw= bw;
this.sfm=sfm;
this.sfh = sfh;
this.pci= pci;
this.qos=qos;
this.s = s;
this.dcf= dcf;
this.qmin=qmin;
this.pmax= pmax;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int getplmn() {
return plmn;
}

public void setplmn(int plmn) {
this.plmn = plmn;
}
public int gettac() {
return tac;
}

public void settac(int tac) {
this.tac = tac;
}

public int getucf() {
return ucf;
}

public void setucf(int ucf) {
this.ucf =ucf;
}

public int getbw() {
return bw;
}

public void setbw(int bw) {
this.bw = bw;
}
public int getsfm() {
return sfm;
}

public void setsfm(int sfm) {
this.sfm = sfm;
}
public int getsfh() {
return sfh;
}

public void setsfh(int sfh) {
this.sfh = sfh;
}

public int getpci() {
return pci;
}

public void setpci(int pci) {
this.pci = pci;
}
public int getqos() {
return qos;
}

public void setqos(int qos) {
this.qos = qos;
}
public int gets() {
return s;
}

public void sets(int s) {
this.s = s;
}

public int getdcf() {
return dcf;
}

public void setdcf(int dcf) {
this.dcf = dcf;
}
public int getqmin() {
return qmin;
}

public void setqmin(int qmin) {
this.qmin = qmin;
}
public int getpmax() {
return pmax;
}

public void setpmax(int pmax) {
this.pmax = pmax;
}
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

Sib ele = (Sib) o;

if (id != ele.id) return false;
if(plmn!=ele.plmn) return false;
if(tac!=ele.tac) return false;
if (ucf != ele.ucf) return false;
if(bw!=ele.bw) return false;
if(sfm!=ele.sfm) return false;
if (sfh != ele.sfh) return false;
if(pci!=ele.qos) return false;
if(qos!=ele.tac) return false;
if (s!= ele.s) return false;
if(dcf!=ele.dcf) return false;
if(qmin!=ele.qmin) return false;
if(pmax!=ele.pmax) return false;
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
return "Id = " + getId() + " ;plmn = " + getplmn() + " ;tac="+ gettac()+" ;Ucf = " + getucf() + " ;Bw = " + getbw() + " ;Sfm="+ getsfm()+" ;Sfh = " + getsfh() + " ;pci = " + getpci() + " ;qos="+ getqos()+" ;S = " + gets() + " ;Dcf = " + getdcf() + " ;qmin="+ getqmin()+" ;Pmax="+ getpmax();
}
}