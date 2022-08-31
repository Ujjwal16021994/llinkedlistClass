public class MergeTwoSortedLinkedList {
    public static node addHead(int n,node head) {
        node newNode = new node(n);
        if(head == null)
        {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static void printList(node head) {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
    public static node merge(node head1,node head2) {
        if(head1 == null)return head2;
        if(head2==null)return head1;
        node temp1 = head1;
        node temp2 = head2;
        node head = null;
        node temp = null;
        while (temp1 != null && temp2 != null)
        {
            if (temp1.data > temp2.data) {
                if (head == null) {
                    head = temp2;
                    temp = head;
                } else {
                    temp.next = temp2;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            } else {
                if (head == null) {
                    head = temp1;
                    temp = head;
                } else {
                    temp.next = temp1;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }
        }
            if (temp1 != null) {
                temp.next = temp1;
            }
            if (temp2 != null) {
                temp.next = temp2;
            }

            return head;
        }
        public static void main (String[]args){
            node head1 = null;
            head1 = addHead(12, head1);
            head1 = addHead(10, head1);
            head1 = addHead(8, head1);
            head1 = addHead(6, head1);
            head1 = addHead(4, head1);
            head1 = addHead(2, head1);
            node head2 = null;
            head2 = addHead(7, head2);
            head2 = addHead(5, head2);
            head2 = addHead(3, head2);
            head2 = addHead(1, head2);
            printList(head1);
            System.out.println();
            printList(head2);
            System.out.println();

            node head = merge(head1, head2);
            printList(head);
        }
    }
