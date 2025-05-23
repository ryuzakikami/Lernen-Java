package Main.Datenstrukturen;

public class Stack {
  Node topNode;


public Stack(Node topNode){
this.topNode = topNode;
}  

public void push(int value){
Node newNode = new Node(value, null);
this.topNode.setNextNode(newNode);
newNode.setPriviousNode(topNode);
this.topNode = newNode;

}
public void pop(){
Node temp = this.topNode.getPriviousNode();
temp.setNextNode(null);
this.topNode= temp;   
}
public int top(){
 return this.topNode.getValue();   
}

public void empty(){
    this.topNode = null;
}

public void PrintStack(){
Node currentNode = this.topNode;
    while(currentNode != null){
        System.out.print(currentNode.getValue());
        System.out.print(",");
        currentNode = currentNode.getPriviousNode();
    }   
}


}
