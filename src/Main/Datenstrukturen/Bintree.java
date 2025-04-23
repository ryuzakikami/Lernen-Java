package Main.Datenstrukturen;
import java.util.LinkedList;
public class Bintree {

    // Feld: Der Wurzelknoten des Baumes
    private Root root;

    // Konstruktor: Erzeugt einen Baum mit einem initialen Wert an der Wurzel.
    public Bintree(int value) {
        this.root = new Root(value, null, null);
    }
  
    /**
     * Fügt einen neuen Knoten mit dem übergebenen Wert in den Baum ein.
     */
    public void insert(int value) {
        Root newLeaf = new Root(value, null, null);
        this.root = addLeave(this.root, newLeaf);
    }

    /**
     * Rekursive Hilfsmethode, um einen Knoten (addRoot) gemäß BST-Regeln in den Teilbaum einzufügen.
     */
    public Root addLeave(Root currentRoot, Root addRoot) {
        if (currentRoot == null) {
            return addRoot;
        }
        // Einfügen in den linken Teilbaum, falls der neue Wert kleiner ist.
        if (addRoot.getValue() < currentRoot.getValue()) {
            currentRoot.setLeftRoot(addLeave(currentRoot.getLeftRoot(), addRoot));
        }
        // Einfügen in den rechten Teilbaum, falls der neue Wert größer ist.
        else if (addRoot.getValue() > currentRoot.getValue()) {
            currentRoot.setRightRoot(addLeave(currentRoot.getRightRoot(), addRoot));
        }
        // Falls der Wert bereits existiert, wird nichts geändert.
        return currentRoot;
    }
    
    public void delete(int key) {
        root = removeLeave(this.root, key);
    }

    public Root removeLeave(Root root, int value) {
        //Rekursions Anker
        if(root == null){
            return null;
        }
        //case 1: Unser zu löschendes Element hat keine Kinder
        if( root.getValue() > value){
            root.setLeftRoot(removeLeave(root.getLeftRoot(),value));
        }
        else if(root.getValue() < value){
           root.setRightRoot(removeLeave(root.getRightRoot(), value));
        }
        //case 2/3: Unser zu löschendes Element hat einen oder mehr Kinder
        else{
            //case 2 Unser zu löschendes Element hat ein Kinde
             //
            if(root.getLeftRoot() == null){
                return root.getRightRoot();
            }
            else if(root.getRightRoot() == null){
               return root.getLeftRoot();
            }
            // case 3 Unser zu löschendes Element hat 2 Kinder
            root.setValue(minValue(root.getRightRoot()));
            root.setRightRoot(removeLeave(root.getRightRoot(), value));
        }
      return root;
    }
    // Sucht von der Wurzel die Übergeben wird auch das kleinste elmment im Teil-baum in dem fall also bis zum letzten linken Knotten im baum durch.    
    public static int minValue(Root root){
        int minv = root.getValue();
        while (root.getLeftRoot() != null) {
            root = root.getLeftRoot();
            minv = root.getValue();
        }
        return minv;
    }

    /**
     * Aktualisiert einen Knoten im Baum.
     * Hier wird als Standardvorgehen der Knoten gelöscht und anschließend mit dem neuen Wert neu eingefügt.
     */
    private Boolean test = false;
     public void updateTree(int update ,int newValue) {
       searchRoot(update,this.root);
        if(test == false){
            return;
       }
       if(update == newValue){
            return;
        }  
        else{
            test = false;
            delete(update);
            insert(newValue);}
        
    }
    
    public void searchRoot(int value, Root r){
        if(r == null){
            return;
        }
        if(r.getValue() == value){
          test = true;
        }
        searchRoot(value, r.getRightRoot());
        searchRoot(value, r.getLeftRoot());
        
    } 
    public LinkedList<Integer> inorder(Root root, LinkedList<Integer> r1 ){
        if(root == null){
        return r1;
        }

        inorder(root.getRightRoot(),r1);
        r1.add(root.getValue());
        inorder(root.getLeftRoot(),r1);
        return r1;
    }

    public Root getRoot() {
        return this.root;
    }
    
    public void setRoot(Root root) {
        this.root = root;
    }

}
