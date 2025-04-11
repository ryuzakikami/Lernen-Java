package Main.Vererbung;

public class Mann extends Mensch  {
    


public Mann(String name,int alter, double groeße, boolean kinder){
 super(name, alter, groeße, kinder, false);
}


public Mann(String name,int alter, double groeße,boolean kinder,int anzahlkinder){
    super(name, alter,groeße,kinder,false, anzahlkinder);     
}
    
}



