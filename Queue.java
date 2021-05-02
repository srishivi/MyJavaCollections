public class Queue{

    public class Node {

        int data;
        Node next;
    

        public Node (int data){
        this.data = data;
        this.next = null;
        }
    }

Node head = null;
Node tail = null;

    public void enqueue(int data){

        Node newNode = new Node (data);

        if (head == null){
            head = newNode;
            tail = newNode;
        }else{

            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue (){
        if(head!=null){
            int data = head.data;
            head = head.next;
            return data;
        }else{

            throw new ArithmeticException("not valid");  

        }
    }

    public boolean isEmpty(){

        if(head != null){
            return false;
        }
        return true;
    }


}