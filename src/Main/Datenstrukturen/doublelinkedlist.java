package Main.Datenstrukturen;

public class doublelinkedlist {
private Node headNode;
private Node tailNode;


public doublelinkedlist(Node headNode,Node tailNode ){
this.tailNode = tailNode;
this.headNode = headNode;
this.headNode.setNextNode(tailNode);
this.tailNode.setPriviousNode(headNode);
}
public Node addNewNode(Node privousNode,Node afterNode, int NodeToAdd){
    Node newnode = new Node(NodeToAdd, privousNode.getNextNode(),privousNode);
    if(privousNode == getHeadNode()){
      newHead(NodeToAdd);
    }
    else if(privousNode == getTailNode()){
    newTail(NodeToAdd);  
    }
    else{
      afterNode.setPriviousNode(newnode);
      privousNode.setNextNode(newnode);
    }
    return newnode;
  }
  public void deleteNode(Node nodetodelete){
    if(nodetodelete == null || nodetodelete.getNextNode() == null|| nodetodelete.getPriviousNode() == null){
       throw new IllegalStateException("Kann Null nicht Löschen");
    }
    Node next = nodetodelete.getNextNode();
    Node privNode = nodetodelete.getPriviousNode();
    nodetodelete.setValue(next.getValue());
    nodetodelete.setNextNode(next.getNextNode());
    nodetodelete.setPriviousNode(privNode.getPriviousNode());
   }
   public void updateNode(int index, int Value){
    Node currentNode = this.headNode;
    int pointer = -1;  
    while (currentNode != null) {
        pointer++;
        if(pointer == index){
            currentNode.setValue(Value);
            return;
        }
       currentNode = currentNode.getNextNode();
     }
     System.out.println("Der index ist außerhalb der liste");
    }
  public void newHead(int nodetoadd){
    Node newHead = new Node(nodetoadd,this.headNode,null);
    this.headNode = newHead;
   }
 
 public void newTail(int nodetoadd){
     Node newTail = new Node(nodetoadd,null,this.tailNode);
     this.tailNode.setNextNode(newTail);
     this.tailNode = newTail;
 }
 public void printlist() {
    Node currentNode = this.headNode;
    while (currentNode != null) {
        System.out.print(currentNode.getValue() + ", ");
        currentNode = currentNode.getNextNode();
    }
    System.out.println("null");
}
public void searchNode(int Value){
    Node currentNode = this.headNode;
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
public int getListlenght(){
    Node currentNode = this.headNode;
    int pointer = 0;
    while (currentNode != null) {
        pointer++;
    }
    return pointer;
}   
   
public Node getHeadNode() {
    return headNode;
}
public Node getTailNode() {
    return tailNode;
}
public void setHeadNode(Node headNode) {
    this.headNode = headNode;
}
public void setTailNode(Node tailNode) {
    this.tailNode = tailNode;
}
}
