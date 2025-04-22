package Main;
import Main.Datenstrukturen.Bintree;
import Main.Rekursion_Algorhitmen.Sort;
import Main.Vererbung.*;

public class App {
    public static void main(String[] args) {
     Bintree tree = new Bintree(10);
     tree.plantLeave(9);
     tree.plantLeave(5);
     tree.plantLeave(22);
     tree.plantLeave(24);
     tree.plantLeave(19);
     tree.plantLeave(15);
     tree.plantLeave(20);
     System.out.println(tree.getRoot().getLeftRoot().getValue());
     tree.updateTree(tree.getRoot().getLeftRoot(), 1);
     System.out.println(tree.getRoot().getLeftRoot().getValue());

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
public static int [] selectionsort(int array[]){

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




