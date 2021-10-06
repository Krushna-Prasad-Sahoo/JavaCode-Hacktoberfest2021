public class TernaryTreeToDLL {  
  
    //Represent a node of ternary tree  
    public static class Node{  
        int data;  
        Node left;  
        Node middle;  
        Node right;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
 //Represent the root of the ternary tree  
    public Node root;  
//Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
//convertTernaryToDLL() will convert the given ternary tree to corresponding doubly linked list  
    public void convertTernaryToDLL(Node node) {  
        //Checks whether node is null  
        if(node == null)  
            return;  
  
        //Keep three pointers to all three children  
        Node left = node.left;  
        Node middle = node.middle;  
        Node right = node.right;  
  
        //If list is empty then, add node as head of the list  
        if(head == null) {  
            //Both head and tail will point to node  
            head = tail = node;  
            node.middle = null;  
            //head's left will point to null  
            head.left = null;  
            //tail's right will point to null, as it is the last node of the list  
            tail.right = null;  
        }  
        //Otherwise, add node to the end of the list  
        else {  
            //node will be added after tail such that tail's right will point to node  
            tail.right = node;  
            //node's left will point to tail  
            node.left = tail;  
            node.middle = null;  
            //node will become new tail  
            tail = node;  
            //As it is last node, tail's right will point to null  
            tail.right = null;  
        }  
  
        //Add left child of current node to the list  
        convertTernaryToDLL(left);  
        //Then, add middle child of current node to the list  
        convertTernaryToDLL(middle);  
        //Then, add right child of current node to the list  
        convertTernaryToDLL(right);  
    }  
  
    //displayDLL() will print out the nodes of the list  
    public void displayDLL() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of generated doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.right;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        TernaryTreeToDLL tree = new TernaryTreeToDLL();  
        //Add nodes to the ternary tree  
        tree.root = new Node(5);  
        tree.root.left = new Node(10);  
        tree.root.middle = new Node(12);  
        tree.root.right = new Node(15);  
        tree.root.left.left = new Node(20);  
        tree.root.left.middle = new Node(40);  
        tree.root.left.right = new Node(50);  
        tree.root.middle.left = new Node(24);  
        tree.root.middle.middle = new Node(36);  
        tree.root.middle.right = new Node(48);  
        tree.root.right.left = new Node(30);  
        tree.root.right.middle = new Node(45);  
        tree.root.right.right = new Node(60);  
  
        //Converts the given ternary tree to doubly linked list  
        tree.convertTernaryToDLL(tree.root);  
  
        //Displays the nodes present in the list  
        tree.displayDLL();  
    }  
}  
