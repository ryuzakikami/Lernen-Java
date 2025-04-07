package Main;
import Main.Datenstrukturen_Algorhitmen.*;

public class App {
    public static void main(String[] args) {
        Node topNode = new Node(1, null, null);
        Stack stack = new Stack(topNode);
        stack.push(2);
        stack.push(44);
        stack.push(22);
        stack.push(1221);
        stack.push(23123);
        stack.PrintStack();
        int x = stack.peak();
        System.out.println("");
        System.out.println(x);
        
      
        
    }
}
