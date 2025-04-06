package Main.Datenstrukturen_Algorhitmen;
public class Root {
private int Value;
private Root leftnode;
private Root rightnode;
    
public Root(int Value, Root leftnode,Root rightnode){
this.Value =Value;
this.leftnode = leftnode;
this.rightnode = rightnode;
}

public Root getLeftnode() {
    return leftnode;
}
public Root getRightnode() {
    return rightnode;
}
public int getValue() {
    return Value;
}

public void setValue(int value) {
    Value = value;
}

}