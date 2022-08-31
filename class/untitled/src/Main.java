public class Main {
    public static Node addNode(Node head,int n) {
        Node newNode = new Node(n);
        if (head == null)
        {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static void printlist(Node head) {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.x+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printreverse(Node head) {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.x+"  ");
            temp = temp.prev;
        }
    }
    public static Node reverselist(Node head) {
        if(head==null || head.next==null)return head;
        Node curr = head;
        Node prev = null;
        Node next = curr.next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            if(prev!=null)
            prev.prev = curr;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static boolean findTarget(Node head,int n) {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node pemt = head;
        while(temp.x>pemt.x)
        {
            int sum = temp.x+pemt.x;
            if(sum==n)return true;
            else if(sum<n)pemt = pemt.next;
            else temp = temp.prev;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = null;
        head = addNode(head,2);
        head = addNode(head,5);
        head = addNode(head,7);
        head = addNode(head,9);
        head = addNode(head,10);
        head = addNode(head,11);
        head = addNode(head,19);
        printlist(head);
//        head = reverselist(head);
//        printreverse(head);
        printlist(head);
//        find target in sorted list
        boolean a = findTarget(head,2);
        System.out.println(a);
    }
}
class Node {
    int x;
    Node next;
    Node prev;

    Node (int n) {
        x = n;
        next = null;
        prev = null;
    }
}