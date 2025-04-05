package Main;
public class Root {
private int Value;
private Node leftnode;
private Node rightnode;
    
public Root(int Value,Node leftnode,Node rightnode){
this.Value =Value;
this.leftnode = leftnode;
this.rightnode = rightnode;
}

public Node getLeftnode() {
    return leftnode;
}
public Node getRightnode() {
    return rightnode;
}
public int getValue() {
    return Value;
}

public void setValue(int value) {
    Value = value;
}

}