package Main;
import java.util.random.*;


public class Sort{

public int [] selectionsortMax(int arr[]){
  int x[] = arr.clone(); 
  int max = 0;
   
  for (int i = 0; i < x.length; i++) {
    max = i;
    for (int j = i+1; j < x.length; j++) {
        max = x[max]< x[j] ? j : max;
    }
    if(max !=i){
      swap(arr, max, i);
    }
  }
  return x;
}

public int [] selectionsortMin(int arr[]){
    int x[] = arr.clone(); 
    int min = 0;
  
    for (int i = 0; i < x.length; i++) {
        min = i;
      for (int j = i+1; j < x.length; j++) {
        min = x[j]< x[min] ? j : min;
      }
      if(min !=i){
      swap(arr, min, i);
      }
    }
    return x;
  }

  
 public static int[] quicksort(int[] array,int lowIndex, int highindex){
      int pivot = array[highindex];
      int leftpointer = lowIndex;
      int rightpointer = highindex;
     if(lowIndex >=highindex){
      return null;
     } 
      while (leftpointer<rightpointer) {
        while (array[leftpointer]<= pivot && leftpointer <rightpointer) {
          leftpointer++;
        }
        while (array[rightpointer]>= pivot && leftpointer <rightpointer) {
          rightpointer--;
        }
        swap(array, leftpointer, rightpointer);
      }
    
       swap(array, leftpointer,highindex);
        
       quicksort(array, lowIndex, leftpointer-1);
       quicksort(array, leftpointer +1, highindex);
    return array;
 } 

 public static void swap(int array[],int index1, int index2){
  int temp = array[index1];
  array[index1] = array[index2];
  array[index2] = temp;
 }
public static void printarray(int[]arr){
for (int i = 0; i < arr.length; i++) {
    System.out.print("[");
    System.out.print(arr[i]);
    System.out.print("]");
}
}
}