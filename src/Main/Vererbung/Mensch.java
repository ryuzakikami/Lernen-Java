package Main.Vererbung;

public class Mensch {
private String name;
private int alter;
private double koerpergroeße;
private boolean kinder;
private boolean istFrau;
private int anzahlkinder;

public Mensch(String name,int alter,double koerpergroeße,boolean kinder,boolean istFrau,int anzahlkinder){
this.name = name;
this.alter = alter;
this.koerpergroeße = koerpergroeße;
this.kinder = kinder;
this.istFrau = istFrau;
this.anzahlkinder = anzahlkinder;
}

public Mensch(String name,int alter,double koerpergroeße,boolean kinder,boolean istFrau){
this.name = name;
this.alter = alter;
this.koerpergroeße = koerpergroeße;
this.kinder = kinder;
this.istFrau = istFrau;
}
    
    

public int getAlter() {
    return alter;
}
public int getAnzahlkinder() {
    return anzahlkinder;
}
public double getKoerpergroeße() {
    return koerpergroeße;
}
public String getName() {
    return name;
}

public boolean getIstFrau(){
    return istFrau;
}
public boolean getKinder(){
    return kinder;
}

public void setAlter(int alter) {
    this.alter = alter;
}
public void setAnzahlkinder(int anzahlkinder) {
    this.anzahlkinder = anzahlkinder;
}
public void setIstFrau(boolean istFrau) {
    this.istFrau = istFrau;
}
public void setKinder(boolean kinder) {
    this.kinder = kinder;
}
public void setKoerpergroeße(double koerpergroeße) {
    this.koerpergroeße = koerpergroeße;
}
public void setName(String name) {
    this.name = name;
}
}
