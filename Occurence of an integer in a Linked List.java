Problem Statement:
Given a singly linked list and a key, count the number of occurrences of given key in the linked list.

Solution:
public static int count(Node head, int search_for)
    {
        Node temp=head;
        int counter=0;
        while(temp!=null)
        {
            if(temp.data==search_for)
                ++counter;
            temp=temp.next;
        }
        return counter;
    }
