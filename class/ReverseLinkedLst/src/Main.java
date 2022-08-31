public class Main {
    public static node addhead(int n,node head) {
        node new_node = new node(n);
        if(head == null)
        {
            head = new_node;
            return head;
        }
        new_node.next = head;
        head = new_node;
        return head;
    }
    public static void printList(node head) {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
    public static node reverseList(node head) {
        node temp = head;
        node head1 = null;
        while(temp!=null)
        {
            node temp1 = head.next;
            head = temp1;
            head1 = addhead(temp.data, head1);
            temp = temp.next;
        }
        return head1;
    }
    public static int count(node head) {
        int count =0;
        node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static int middleelement(node head) {
        int size = count(head);
        int mid = size/2;
        node temp = head;
        int count =0;
        while(count!=mid)
        {
            count++;
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        node head = null;
        head = addhead(5,head);
        head = addhead(10,head);
        head = addhead(15,head);
        head = addhead(20,head);
        head = addhead(25,head);
        printList(head);
        head = reverseList(head);
        System.out.println();
        printList(head);
        System.out.println();
        System.out.println(middleelement(head));
    }
}

class node {
    int data;
    node next;

    node (int n) {
        data = n;
        next = null;
    }
}