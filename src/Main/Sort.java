package Main;
import java.util.Arrays;

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
     int temp = x[max];
     x[max] = x[i];
     x[i] = temp;
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
       int temp = x[min];
       x[min] = x[i];
       x[i] = temp;
      }
    }
    return x;
  }
 public int [] quicksort(int ary[]){
     

    
    return ary;
 } 

public void printarray(int[]arr){
for (int i = 0; i < arr.length; i++) {
    System.out.print("[");
    System.out.print(arr[i]);
    System.out.print("]");
}
}
}