package Main;
import java.util.Random;
import java.util.random.*;

public class App {
    public static void main(String[] args) throws Exception {
      Random rand = new Random();
        int[] x = {3434,3465345,2,5};

        int[] z = Sort.quicksort(x, 0, x.length-1);

        Sort.printarray(z);

        
    }
}
