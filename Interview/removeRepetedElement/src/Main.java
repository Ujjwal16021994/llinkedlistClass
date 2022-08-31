import java.util.HashSet;
public class Main {

        public static mede addmede(mede head,int n) {
            mede newmede = new mede(n);
            if(head == null)
            {
                head = newmede;
                return head;
            }
            mede temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newmede;
            return head;
        }
        public static void print(mede head) {
            mede temp = head;
            while(temp!=null)
            {
                System.out.print(temp.x+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void deletRepeted(mede head) {
            mede temp = head;
            mede prev = null;
            HashSet<Integer> set = new HashSet<>();
            while(temp!=null)
            {
                while(set.contains(temp.x))
                {
                    temp = temp.next;
                    prev.next = temp;
                }
                set.add(temp.x);
                prev = temp;
                temp = temp.next;

            }
        }
        public static mede reverse(mede head) {
            mede curr = head;
            mede prev = null;
            mede next;
            while(curr!=null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            return prev;
        }
    public static void main(String[] args) {
        mede head = null;
        head = addmede(head,3);
        head = addmede(head,6);
        head = addmede(head,9);
        head = addmede(head,12);
        head = addmede(head,15);
        head = addmede(head,3);
        head = addmede(head,9);
        head = addmede(head,18);
        head = addmede(head,6);
        head = addmede(head,21);
        print(head);
        deletRepeted(head);
        print(head);
        head = reverse(head);
        print(head);
    }
}
class mede {
    int x;
    mede next;
    mede (int n) {
        x = n;
        next = null;
    }
}