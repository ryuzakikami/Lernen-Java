package Main;
import java.util.LinkedList;
public class Linkedlist {
private Node Head ;


public Linkedlist(Node Head){
 this.Head = Head;   
}

public void add(Node nodebeforNode, int nodetoadd){
  Node newnode = new Node(nodetoadd, nodebeforNode.getNextNode());
  nodebeforNode.setNextNode(newnode);
}

public void newHead(int nodetoadd){
   Node newHead = new Node(nodetoadd,this.Head);
   this.Head = newHead;
  }


public void pop(Node nodetodelete){
 if(nodetodelete == null || nodetodelete.getNextNode() == null){
    throw new IllegalStateException("Kann Null nicht Löschen");
 }

 Node next = nodetodelete.getNextNode();
 nodetodelete.setValue(next.getValue());
 nodetodelete.setNextNode(next.getNextNode());
 System.out.println(next);
}

public void printlist(){
Node currentNode = Head;
while(currentNode != null){
    System.err.print(currentNode.getValue());
    currentNode.getNextNode();
}
System.out.println("Null");
}

public Node getHead() {
    return Head;
}
    
}