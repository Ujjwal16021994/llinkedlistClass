

    public class MakeDublyLinkList {

        public static Node addheadNode(int n,Node head) {
            Node new_node = new Node(n);
            if(head == null)
            {
                head = new_node;
                return head;
            }
            new_node.next = head;
            head = new_node;
            Node temp = head;
            temp = temp.next;
            temp.prev = new_node;

            return head;
        }
        public static Node addnode(int n,Node head) {
            Node newnode = new Node(n);
            if(head==null)
            {
                head = newnode;
                return head;
            }
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next =newnode;
            newnode.prev = temp;
            return head;
        }
        public static void printList(Node head) {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static Node addafter(Node head,int m,int n) {
            Node newnode = new Node(n);
            Node temp = head;
            while(temp.data!=m && temp!=null)
            {
                temp =temp.next;
            }
            if(temp ==null)
            {
                return head;
            }
            Node t1 = temp;
            Node t2 = temp.next;
            t1.next = newnode;
            newnode.next = t2;
            t2.prev = newnode;
            newnode.prev = t1;
            return head;
        }
        public static Node deletfirst(Node head) {
            if(head==null)
                return head;
            Node temp = head.next;
            head = temp;
            return head;
        }
        public static Node deletlast(Node head) {
            if(head == null)return head;
            Node temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
        public static Node deletafter(Node head,int n) {
            if(head == null)return head;
            Node temp = head;
            while(temp.data!=n && temp!=null)
            {
                temp = temp.next;
            }
            if(temp==null)return head;
            temp.next = temp.next.next;
            if(temp.next.next!=null)
                temp.next.next.prev = temp;
            return head;
        }
        public static Node deletnode(Node head,int n)
        {
            if(head == null)return head;
            if(head.data==n)return head.next;
            Node temp = head;
            while(temp.next.data!=n)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next.next!=null)
                temp.next.next.prev = temp;
            return head;
        }
        public static void main(String[] args) {
            Node head  = null;
            head = addheadNode(4,head);
            head = addnode(8,head);
            head = addheadNode(3,head);
            head = addnode(9,head);
            head = addheadNode(2,head);
            head = addnode(10,head);
            printList(head);
            head = addafter(head,4,5);
            head = addafter(head,5,6);
            head = addafter(head,6,7);
            printList(head);
            head = deletfirst(head);
            head = deletlast(head);
            head = deletafter(head,5);
            head = deletnode(head,7);
            printList(head);
        }
    }

    class Node {
        int data;
        Node prev;
        Node next;


        Node (int n) {
            data = n;
            next = null;
            prev = null;
        }
    }