package Main.Datenstrukturen_Algorhitmen;
public class Root {
private int Value;
private Root leftRoot;
private Root rightRoot;
    
public Root(int Value, Root leftRoot,Root rightRoot){
this.Value =Value;
this.leftRoot = leftRoot;
this.rightRoot = rightRoot;
}
public Root getLeftRoot() {
    return leftRoot;
}
public Root getRightRoot() {
    return rightRoot;
}
public void setLeftRoot(Root leftRoot) {
    this.leftRoot = leftRoot;
}
public void setRightRoot(Root rightRoot) {
    this.rightRoot = rightRoot;
}
public int getValue() {
    return Value;
}

public void setValue(int value) {
    Value = value;
}

}