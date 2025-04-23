package Main;
import java.util.LinkedList;

import Main.Datenstrukturen.Bintree;
import Main.Rekursion_Algorhitmen.Sort;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
     Bintree tree = new Bintree(10);
     tree.insert(9);
     tree.insert(5);
     tree.insert(22);
     tree.insert(18);
     tree.insert(19);
     tree.insert(15);
     tree.insert(21);
     LinkedList<Integer> l1 = new LinkedList<>();
     tree.updateTree(21, 31);
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







