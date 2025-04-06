package Main;


public class Linkedlist {
private Node Head;
private Node tail;


public Linkedlist(Node Head, Node tail){
 this.Head = Head;   
 this.tail = tail;
}

public Node addNewNode(Node nodebeforNode, int NodeToAdd){
  Node newnode = new Node(NodeToAdd, nodebeforNode.getNextNode());
  if(nodebeforNode == getHead()){
    newHead(NodeToAdd);
  }
  else if(nodebeforNode == getTail()){
  newTail(NodeToAdd);  
  }
  else{
    nodebeforNode.setNextNode(newnode);
  }
  return newnode;
}

public void linktowNodes(Node nodebeforNode, Node NodeToAdd){
    nodebeforNode.setNextNode(NodeToAdd);
  }

public void newHead(int nodetoadd){
   Node newHead = new Node(nodetoadd,this.Head);
   this.Head = newHead;
  }

public void newTail(int nodetoadd){
    Node newTail = new Node(nodetoadd,null);
    this.tail.setNextNode(newTail);
    this.tail = newTail;
}

public void deleteNode(Node nodetodelete){
 if(nodetodelete == null || nodetodelete.getNextNode() == null){
    throw new IllegalStateException("Kann Null nicht Löschen");
 }
 Node next = nodetodelete.getNextNode();
 nodetodelete.setValue(next.getValue());
 nodetodelete.setNextNode(next.getNextNode());
}

public void printlist() {
    Node currentNode = this.Head;
    while (currentNode != null) {
        System.out.print(currentNode.getValue() + ", ");
        currentNode = currentNode.getNextNode();
    }
    System.out.println("null");
}
public void searchNode(int Value){
    Node currentNode = this.Head;
    int pointer = -1;
    int index = -1;
    while (currentNode != null) {
      pointer++;
       if(currentNode.getValue() == Value){
           index = pointer;
           System.out.println(index);
           return;
       }
       currentNode = currentNode.getNextNode();
   }
   System.out.println(index);
   }
public Node getHead() {
    return Head;
}

public Node getTail() {
    return tail;
}
public void setTail(Node tail) {
    this.tail = tail;
}

}