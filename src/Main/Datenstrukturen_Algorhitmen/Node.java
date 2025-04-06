package Main.Datenstrukturen_Algorhitmen;
public class Node {
private int Value;
private Node nextNode = null;
private Node priviousNode = null;

public Node(int Value, Node nextNode){
    this.Value = Value;
    this.nextNode = nextNode;
}

public Node(int Value, Node nextNode, Node priviousNode){
    this.Value = Value;
    this.nextNode = nextNode;
    this.priviousNode = priviousNode;
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
public Node getPriviousNode() {
    return priviousNode;
}
public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
}
public void setPriviousNode(Node priviousNode) {
    this.priviousNode = priviousNode;
}

}