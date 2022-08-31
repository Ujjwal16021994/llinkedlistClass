

        public class NewMethodToReverseLinkedListAndFindMidByAliSir {
            public static node addfirst(int n,node head) {
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
                while(temp!=null)
                {
                    System.out.print(temp.data+"  ");
                    temp = temp.next;
                }
            }
            public static node reverseList(node head) {
                if(head==null || head.next==null)
                {
                    return head;
                }
                System.out.println();
                node prev,curr,next;
                prev = null;
                curr = head;
                next = curr.next;
                while(curr!=null)
                {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                return prev;
            }
            public static int midelement(node head) {
                node fast = head;
                node slow = head;
                while(fast!=null && fast.next!=null)
                {
                    fast = fast.next.next;
                    slow = slow.next;
                }
                return slow.data;
            }
            public static void main(String[] args) {
                node head = null;
                head = addfirst(4,head);
                head  = addfirst(8,head);
                head = addfirst(12,head);
                head = addfirst(16,head);
                head = addfirst(20,head);
                head = addfirst(24,head);
                head = addfirst(28,head);
                printList(head);
                head = reverseList(head);
                System.out.println();
                printList(head);
                System.out.println();
                System.out.print(midelement(head));
    }
}
