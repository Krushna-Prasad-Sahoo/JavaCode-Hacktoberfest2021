
public class QueueArrayApp {

    public static void main(String[] args) {
        
        QueueArray x = new QueueArray(5);
        x.enqueue(2);
        x.enqueue(8);
        x.enqueue(3);
        x.display();
        
        try {
            x.dequeue();
            x.display();
            x.enqueue(23);
            x.enqueue(45);
            x.enqueue(59);
            x.enqueue(89);
            x.display();
            x.dequeue();
            x.display();
            x.enqueue(99);
            System.out.println(x.peek());
            x.display();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       
        
        
    }
}

class QueueArray {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArray(int s) {
        this.queArray = new int[s];
        this.maxSize = s;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isEmpty() {
        return this.nItems == 0;
    }

    public boolean isFull() {
        return this.nItems == this.maxSize;
    }

    public int size() {
        return this.nItems;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full.Insertion Terminated");
            return;
        }
        rear = (rear + 1) % maxSize;
        queArray[rear] = value;
        nItems++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Nothing to delete. Deletion Terminated");
        }
        int removedItem = this.queArray[front];
        front = (front + 1) % maxSize;
        nItems--;
        return removedItem;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty. Cannot get peek value");
        }
        return this.queArray[this.front];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty. Nothing to Print");
            return;
        }
        System.out.println();
        System.out.println("Items in the Array : ");
        int i = this.front;
        while (i != rear) {
            System.out.print(queArray[i] + " ");

            i = (i + 1) % maxSize;            
        }
        System.out.print(queArray[rear]);
        System.out.println();
    }
