package Main;

import java.util.LinkedList; 
import java.util.List;
import Main.Datenstrukturen.Bintree;
import Main.Rekursion_Algorhitmen.Sort;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
    
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
public static int [] quicksort(int array[], int lowindex, int highindex){
 if(lowindex >= highindex){
        return array;
    }
int pivot = array[highindex];
int leftpointer = lowindex;
int rigthpointer = highindex-1;

while (leftpointer<=rigthpointer) {
    while (leftpointer<=rigthpointer && array[rigthpointer]>pivot) {
        rigthpointer--;
    }
    while (leftpointer<=rigthpointer&& array[leftpointer]< pivot) {
        leftpointer++;
    }
    if (leftpointer<=rigthpointer) {
        swap(array, leftpointer, rigthpointer);
        rigthpointer--;
        leftpointer++;
    }
}
swap(array, leftpointer, highindex);
quicksort(array, lowindex, leftpointer-1);
quicksort(array, leftpointer+1, highindex);
return array;
}

public static void swap(int [] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

public static int Binäresuche(int[]array, int key){
 int lowindex = 0;
 int highindex = array.length-1;
 while (lowindex<=highindex) {
    int mid = (lowindex +highindex)/2;
    int midvalue = array[mid];
    if (key == midvalue) {
        return mid;
    }
    highindex = (midvalue > key)?mid-1 : highindex;
    lowindex = (midvalue < key)?mid+1 : lowindex;
 }
 return -1;   
}


}



