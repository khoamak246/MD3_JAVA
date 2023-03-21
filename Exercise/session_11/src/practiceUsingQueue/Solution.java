package practiceUsingQueue;

public class Solution {
    private Queue myQueue = new Queue();
    public void enQueue(int number) {
        Node temp = new Node(number);
        if (myQueue.front == null)
            myQueue.front = myQueue.rear = temp;
        else {
            myQueue.rear.link = temp;
            myQueue.rear = temp;
        }
    }

    public Node deQueue(){
        Node temp = myQueue.front;
        if (myQueue.front == null)
            return null;
        myQueue.front = temp.link;
       return temp;
    }
    public Queue getMyQueue() {
        return myQueue;
    }
}
