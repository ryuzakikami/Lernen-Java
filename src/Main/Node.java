package Main;
public class Node {
private int Value;
private Node nextNode = null;


public Node(int Value, Node nextNode){
    this.Value = Value;
    this.nextNode = nextNode;
}
   

public int getValue() {
    return Value;
}
public void setValue(int value) {
    Value = value;
    
}
public Node getNextNode() {
    return nextNode;
}
public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
}

}