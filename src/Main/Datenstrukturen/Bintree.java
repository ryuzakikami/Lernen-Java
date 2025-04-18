package Main.Datenstrukturen;

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
    public void plantLeave(int value) {
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

    /**
     * Löscht den Knoten mit dem angegebenen Wert aus dem Baum.
     * Falls der zu löschende Knoten Kinder besitzt, werden diese neu "gepflanzt" (wieder eingefügt).
     */
    public void removeLeave(int value) {
        // Suche den Knoten und seinen Elternknoten
        Root[] roots = searchRoot(value);
        Root parent = roots[0];
        Root nodeToRemove = roots[1];

        // Knoten wurde nicht gefunden
        if (nodeToRemove == null) {
            System.out.println("Knoten mit dem Wert " + value + " wurde nicht gefunden.");
            return;
        }

        // Falls der Knoten Kinder besitzt, "pflanze" diese wieder in den Baum ein.
        // (Hinweis: Diese Vorgehensweise verliert die ursprüngliche Struktur des Teilbaumes,
        //  rein wertbasiert werden die Kinder wieder eingefügt.)
        if (nodeToRemove.getLeftRoot() != null) {
            // Es wird der gesamte Teilbaum ab dem linken Kind neu eingefügt.
            plantLeave(nodeToRemove.getLeftRoot().getValue());
        }
        if (nodeToRemove.getRightRoot() != null) {
            plantLeave(nodeToRemove.getRightRoot().getValue());
        }

        // Entferne den Knoten, indem die Referenz vom Elternknoten entfernt wird.
        if (parent != null) {  // Falls nodeToRemove nicht die Wurzel ist
            if (parent.getLeftRoot() == nodeToRemove) {
                parent.setLeftRoot(null);
            } else if (parent.getRightRoot() == nodeToRemove) {
                parent.setRightRoot(null);
            }
        } else {
            // Falls der zu löschende Knoten die Wurzel ist, leere den Baum.
            this.root = null;
        }
    }

    /**
     * Aktualisiert einen Knoten im Baum.
     * Hier wird als Standardvorgehen der Knoten gelöscht und anschließend mit dem neuen Wert neu eingefügt.
     */
    public void updateTree(Root node, int newValue) {
        // Suche den Knoten, der upgedated werden soll (mithilfe des Wertes des übergebenen Knotens).
        Root[] r = searchRoot(node.getValue());
        Root rootToUpdate = r[1];

        if (rootToUpdate != null) {
            // Entferne den alten Knoten.
            removeLeave(node.getValue());
            // Füge den neuen Wert in den Baum ein.
            plantLeave(newValue);
        } else {
            System.out.println("Knoten mit dem Wert " + node.getValue() + " wurde nicht gefunden.");
        }
    }
   
    /**
     * Durchsucht den Baum nach dem Knoten mit dem angegebenen Wert und liefert ein Array zurück:
     * [Elternknoten, aktueller Knoten]. Ist kein Knoten vorhanden, ist letzteres null.
     */
    public Root[] searchRoot(int value) {
        Root currentRoot = this.root;
        Root parent = null;
        while (currentRoot != null) {
            if (value < currentRoot.getValue()) {
                parent = currentRoot;
                currentRoot = currentRoot.getLeftRoot();
            } else if (value > currentRoot.getValue()) {
                parent = currentRoot;
                currentRoot = currentRoot.getRightRoot();
            } else {
                break;
            }
        }
        return new Root[]{parent, currentRoot};
    }
 
    public Root getRoot() {
        return this.root;
    }
    
    public void setRoot(Root root) {
        this.root = root;
    }
}
