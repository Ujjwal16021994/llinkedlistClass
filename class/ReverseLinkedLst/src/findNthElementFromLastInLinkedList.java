
    public class findNthElementFromLastInLinkedList {
        public static int NthFromLast(int n,node head) {
            int size = size(head);
            int position = size-n+1;
            node temp = head;
            while(position!=1)
            {
                position--;
                temp = temp.next;
            }
            return temp.data;
        }
        public static int size(node head) {
            node temp = head;
            int count =0;
            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
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
        public static void main(String[] args) {
            node head = null;
            head = addhead(3,head);
            head = addhead(6,head);
            head = addhead(9,head);
            head = addhead(12,head);
            head = addhead(15,head);
            head = addhead(18,head);
            System.out.println(NthFromLast(3,head));
        }
}
