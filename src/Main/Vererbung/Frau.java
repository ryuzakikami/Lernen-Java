package Main.Vererbung;

public class Frau extends Mensch {

    public Frau(String name,int alter, double groeße,boolean kinder,int anzahlkinder){
        super(name, alter,groeße, kinder, true, anzahlkinder);
    }

    public Frau(String name,int alter, double groeße,boolean kinder){
        super(name, alter,groeße, false, true);
    }


}
