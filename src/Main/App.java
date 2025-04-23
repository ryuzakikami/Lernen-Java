package Main;
import java.util.LinkedList;

import Main.Datenstrukturen.Bintree;
import Main.Rekursion_Algorhitmen.Sort;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
     Bintree tree = new Bintree(10);
     tree.plantLeave(9);
     tree.plantLeave(5);
     tree.plantLeave(22);
     tree.plantLeave(22);
     tree.plantLeave(19);
     tree.plantLeave(15);
     tree.plantLeave(20);
     LinkedList<Integer> l1 = new LinkedList<>();
     tree.delete(22);
     System.out.println(tree.inorder(tree.getRoot(),l1));
   }

   public static Mensch erzeugeMensch(String name,int alter,double koerpergroeße,boolean kinder,boolean istFrau,int anzahlkinder){
   if(alter <18){
    if(istFrau == false){
        
     Junge newJunge = new Junge(name, alter, koerpergroeße);
     return newJunge;
    }    
    else{
        Maedchen newMaedchen = new Maedchen(name, alter, koerpergroeße);
        return newMaedchen; 
    }    
   }   
   else{
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
}







