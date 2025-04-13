package Main;
import java.util.LinkedList;
import Main.Datenstrukturen.Bintree;
import Main.Rekursion_Algorhitmen.Sort;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
        int[] t = {9,2,3434,123,123,1,3333,11};
        quicksort(t, 0, t.length-1);
        Sort.printarray(t);
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

public static int[] quicksort(int[] array, int lowIndex, int highIndex) {
if(lowIndex >= highIndex){
    return array;
}

int pivot = array[highIndex];
int leftPointer = lowIndex;
int rightPointer = highIndex -1;


while (leftPointer <= rightPointer) {
    while (leftPointer <= rightPointer && array[leftPointer] < pivot) {
        leftPointer++;
    }
    while (leftPointer <= rightPointer && array[rightPointer] > pivot) {
        rightPointer--;
    }
    if (leftPointer <= rightPointer) {
        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;
        rightPointer--; 
        leftPointer++;
    }
}

int temp = array[leftPointer];
array[leftPointer] = array[highIndex];
array[highIndex] = temp;

quicksort(array, lowIndex, leftPointer-1);
quicksort(array, leftPointer+1, highIndex);
return array;
}
}




