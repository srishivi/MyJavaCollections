public class QueueTest{

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.dequeue());

        
    }
}