
public class App {

    public static void main(String [] args) {
        Node head=new Node(25);

        Node tail=head;

        for(int i=0; i<10; ++i){
            Node node=new Node(22+i);
            tail.setNext(node);
            tail=node;
        }

        for(Node current=head; current!=null; current=current.getNext()){
            System.out.println(current.getData());
        }

    }
}