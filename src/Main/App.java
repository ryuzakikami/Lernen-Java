package Main;


public class App {
    public static void main(String[] args) throws Exception {
        int[] x = {3434, 346534, 3, 5,66,655656,53,1332,123,52345,1111,22};
        int [] y = Sort.selectionsortMin(x);
        Sort.printarray(y);
        int z = Sort.binaereSuche(y, 5);
        System.out.println("");
        System.out.println(z);  
    } 
}