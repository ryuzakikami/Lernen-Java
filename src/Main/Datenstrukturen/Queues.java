package Main.Datenstrukturen;

public class Queues {
private Node front;
private Node Back;

public Queues(Node front, Node Back){
this.Back = Back;
this.front = front;
this.Back.setNextNode(front);
this.front.setPriviousNode(Back);
}

public void enque(int value){
Node newNode = new Node(value, this.Back);
this.Back.setPriviousNode(newNode);
this.Back = newNode;
}

public void deque(){
  Node temp = this.front.getPriviousNode();
  temp.setNextNode(null); 
  this.front = temp;
}

public int front(){
return this.front.getValue();
}

public void printQueue(){
  Node currNode = this.front;
  while (currNode !=null) {
    System.out.println(currNode.getValue());
    currNode = currNode.getNextNode();
  }
  return;
}
}
