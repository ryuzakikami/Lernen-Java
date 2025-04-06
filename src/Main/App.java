package Main;

public class App {
    public static void main(String[] args) {
        Node tail = new Node(33, null);
        Node n1 = new Node(21, tail);
        Node head = new Node(22, n1);
        tail.setPriviousNode(head);

        Linkedlist list = new Linkedlist(head, tail);
        Node n2 = list.addNewNode(n1, 0);
        Node n3 = list.addNewNode(n2, 13);
        Node n4 = list.addNewNode(n3, 2);
        Node n5 = list.addNewNode(n4, 44);
        int x =  n3.getValue();
        list.searchNode(44);
        list.printlist(); 
    }
}
