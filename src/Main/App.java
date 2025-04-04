import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Integer> x = new ArrayList<>();
        int y = 15;
        for(int i = 0; i < y; i++){
           if(i%2 == 0){
            x.add(i);
            continue;
           } 
        }

       for (int i = 0; i < x.size(); i++) {
        System.out.println(x.get(i));
       } 
      
        
    }
}
