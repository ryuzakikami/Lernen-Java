package Main.Rekursion_Algorhitmen;



public class Sort{

public static int  [] selectionsortMax(int arr[]){
  int x[] = arr.clone(); //kopie des Arrays
  int max = 0;// stratet das erste elmment als größtes
   
  for (int i = 0; i < x.length; i++) {
    max = i; //Index des Aktuellen Maximum
    for (int j = i+1; j < x.length; j++) {
        max = x[max]< x[j] ? j : max;
    }
    if(max !=i){
      swap(x, max, i);
    }
  }
  return x;
}
public static int [] selectionsortMin(int arr[]){
    int x[] = arr.clone(); //kopie des Arrays
    int min = 0;// stratet das erste elmment als kleinstes
    
    for (int i = 0; i < x.length; i++) {
        min = i; //Index des Aktuellen Minimums
      for (int j = i+1; j < x.length; j++) {
        min = x[j]< x[min] ? j : min;
      }
      if(min !=i){ // Wenn das Minimum an einer anderen Stelle geunden wird Tausche x[index aktuelles minumum] mit x[index des neuen minumum]
      swap(x, min, i);
      }
    }
    return x;
  }

  
  public static int[] quicksort(int[] array, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) { // Rekursionsanker: Wenn das Teilarray höchstens ein Element enthält (lowIndex ≥ highIndex), ist keine Sortierung nötig
        return array;
    }

    int pivot = array[highIndex]; //Element am Ende des Teilarrays (kann auch ein beliebiges Element sein).
    int leftPointer = lowIndex; //Zeiger auf das erste Element des aktuellen Teilarrays
    int rightPointer = highIndex - 1; //Zeiger auf das vorletzte Element des aktuellen Teilarrays (da highIndex das Pivot enthält).

    while (leftPointer <= rightPointer) { // Schleife, solange sich die beiden Zeiger nicht Überschreiten (leftPointer ≤ rightPointer).:
        
      while (leftPointer <= rightPointer && array[leftPointer] < pivot) { //Solange das Element am linken Zeiger kleiner als das Pivot ist, wird der leftPointer inkrementiert:
            leftPointer++;
        }
        while (leftPointer <= rightPointer && array[rightPointer] > pivot) { //Solange das Element am rechten Zeiger größer als das Pivot ist, wird der rightPointer dekrementiert:
            rightPointer--;
        }
        //Tauscht die Elemente, die auf der falschen Seite des Pivots liegen.
        if (leftPointer <= rightPointer) {
            swap(array, leftPointer, rightPointer);
            leftPointer++;
            rightPointer--;
        }
    }
   // Tauscht das Element an der Stelle leftPointer mit dem Pivot (am Ende des Teilarrays),
   // sodass das Pivot an seine korrekte sortierte Position gelangt.
    swap(array, leftPointer, highIndex);
    //Führt die Partitionierung rekursiv für das linke und das rechte Teilarray aus.
    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);

    return array;
}
//Methode zum Tauschen von elementen in einem Array
private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

public static void printarray(int[]arr){
for (int i = 0; i < arr.length; i++) {
    System.out.print("[");
    System.out.print(arr[i]);
    System.out.print("]");
}
}

public static int linearesuche(int[] array, int key){
  int keyindex = -1;
  for (int i = 0; i < array.length-1; i++) { // Itteriert das array ein mal durch für die gesamte länge des array
    keyindex = array[i] == key? i: keyindex; // wenn der Wert auf den i zeigt gleich der gesuchten Zahl ist dann ist i der index des keys, sonst behalte den Wert -1 bei
 }
 if(keyindex == -1){
  System.out.println("Key ist nicht in dem Array enthalten");
  return keyindex;
 }
 return keyindex;
}

//BinaereSuche nur möglich bei bereits sortierten Listen
public static int binaereSuche(int[] array, int key) {
  int low = 0; // Pointer der auf Element aufg der Linken Seite im Array zeigt 
  int high = array.length - 1; // Pointer der Immer auf die Element auf rechten Seite des Arrays zeigt

  while (low <= high) {
    int mid = (low + high) / 2; //Index des Elemnets in der Mitte des Array
      int midValue = array[mid];
      if (key == midValue) {
          return mid; 
      }
      high = (key < midValue) ? mid - 1 : high; // wenn der Key kleiner dem Elemment in der mitte ist verschiebe den Pointer high eins nach Links von dem Elemment in der Mitte
      low  = (key > midValue) ? mid + 1 : low;  // wenn der Key größer dem Elemment in der mitte ist verschiebe den Pointer low eins nach Rechts von dem Elemment in der Mitte
  }
  return -1; 
}



}