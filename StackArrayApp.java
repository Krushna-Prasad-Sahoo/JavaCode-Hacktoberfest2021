
import java.util.logging.Level;
import java.util.logging.Logger;

public class StackArrayApp {

    public static void main(String[] args) {
        StackArrayApp s = new StackArrayApp();
        System.out.print("Binary value of 50 is : ");
        s.decToBin(50);
    }

    public void decToBin(int n) {

        int temp = n, cnt = 0;
        while (temp != 0) {
            temp = temp / 2;
            cnt++;
        }

        StackArray myStack = new StackArray(cnt);
        temp = n;
        while (temp != 0) {
            int rem = temp % 2;
            temp = temp / 2;
            myStack.push(rem);
        }
        while (!myStack.isEmpty()) {
            try {
                System.out.print(myStack.pop());
            } catch (Exception ex) { 
                System.out.println(ex);
            }
        }
        System.out.println("");
    }
}

class StackArray {

    private int maxSize; //size of stack array
    private int[] stackData;
    private int top; //top of stack
//-------------------------------------------------------------------------

    public StackArray(int s) {
        this.maxSize = s;
        this.stackData = new int[s];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == maxSize - 1);
    }

    public void push(int item) {
        if (this.isFull()) {
            System.out.println("Stack is full");
        } else {
            this.top++;
            this.stackData[this.top] = item;
        }
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            //System.out.println("stack is empty. nothing to return");
            throw new Exception("stact is empty , cannot pop");
        }

        int temp = stackData[top];
        top--;
        return temp;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("stack is empty. nothing toreturn");
            return -1;
        }

        int temp = stackData[top];
        return temp;
    }

    public void display() {
        System.out.println("Data within the stack");
        for (int i = this.top; i > -1; i--) {
            System.out.print(this.stackData[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        StackArray st = new StackArray(5);
        st.push(3);
        st.push(6);
        st.push(1);
        st.push(2);

        st.display();
        System.out.println("peek : " + st.peek());

        try {
            int k = st.pop();
            System.out.println("popped : " + k);
            System.out.println("popped : " + st.pop());
            System.out.println("popped : " + st.pop());
            //System.out.println("popped : "+st.pop());
            //System.out.println("popped : "+st.pop());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        st.display();
    }

}
