package Main;
import Main.Rekursion_Algorhitmen.*;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
     Mensch tamara = erzeugeMensch("tamara", 14, 1.40, false, false, 0);

   

     System.out.println( tamara.getClass());
     
   }


   public static Mensch erzeugeMensch(String name,int alter,double koerpergroeße,boolean kinder,boolean istFrau,int anzahlkinder){
    if(istFrau == false){
        if (kinder == false) {
            Mann newMann = new Mann(name, alter, koerpergroeße,false);
            return newMann;
        } else {
            Mann newMann = new Mann(name, alter, koerpergroeße, true, anzahlkinder);
            return newMann;
        }
    }    
    else{
        if (kinder == false) {
            Frau newFrau = new Frau(name, alter, koerpergroeße, false);
            return newFrau;
        } else {
            Frau newFrau = new Frau(name, alter, koerpergroeße, true, anzahlkinder);
            return newFrau;
        }
    }    
    }
    }


