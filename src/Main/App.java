package Main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import Main.Sort;

public class App {
    public static void main(String[] args) throws Exception {
        int z [] = {33,23,3,111,21};
        Sort s = new Sort();
        int[] y  = s.selectionsortMax(z);
        int[] c  = s.selectionsortMin(z);
        s.printarray(y);
        System.out.println("");
        s.printarray(c);
    }
}
