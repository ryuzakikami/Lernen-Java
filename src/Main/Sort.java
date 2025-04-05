package Main;
import java.util.random.*;


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
      if(min !=i){ // Wenn das Minimum an einer anderen Stelle geunden wird Tausche x[index aktuelles minumum] mit x[index des neuen minumux]
      swap(x, min, i);
      }
    }
    return x;
  }

  
  public static int[] quicksort(int[] array, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) {
        return null;
    }

    int pivot = array[highIndex];
    int leftPointer = lowIndex;
    int rightPointer = highIndex - 1;

    while (leftPointer <= rightPointer) {
        while (leftPointer <= rightPointer && array[leftPointer] < pivot) {
            leftPointer++;
        }
        while (leftPointer <= rightPointer && array[rightPointer] > pivot) {
            rightPointer--;
        }
        if (leftPointer <= rightPointer) {
            swap(array, leftPointer, rightPointer);
            leftPointer++;
            rightPointer--;
        }
    }

    swap(array, leftPointer, highIndex);
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
  for (int i = 0; i < array.length; i++) {
    keyindex = array[i] == key? i: keyindex;
 }
 if(keyindex == -1){
  System.out.println("Key ist nicht in dem Array enthalten");
  return -1;
 }
 return keyindex;
}
public static int binearesuche(int[] array, int key){

  
}

}