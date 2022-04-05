import java.util.Random;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size = 0;

    LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void shuffle(int shuffle_count) {

        Random rand = new Random();
        for(int i = 0; i < shuffle_count; i++) {

            int r1 = rand.nextInt(52);
            int r2 = rand.nextInt(52);

            swap(r1,r2);
        }
    }

    public Card remove_from_index(int index) {
        // FIXME
    }

    public void insert_at_index(Card x, int index) {
        // FIXME
    }

    public void swap(int index1, int index2) {
        // FIXME
    }

    public void add_at_tail(Card data) {
        // FIXME
    }

    public Card remove_from_head() {
        // FIXME
    }

    public void sanity_check() {
        Node curr = head;
        int count_forward = 0;
        while (curr != null) {
            curr = curr.next;
            count_forward++;
        }

        curr = tail;
        int count_backward = 0;
        while (curr != null) {
            curr = curr.prev;
            count_backward++;
        }

        if (count_backward == count_forward && count_backward == size) {
            System.out.println("Basic sanity Checks passed");
        }
        else {
            System.out.println("count forward:  " + count_forward);
            System.out.println("count backward: " + count_backward);
            System.out.println("Size of LL:     " + size);
            System.out.println("Sanity checks failed");
            System.exit(-1);
        }
    }

    public void print() {
        Node curr = head;
        int i = 1;
        while(curr != null) {
            curr.data.print_card();
            if(curr.next != null)
                System.out.print(" -->  ");
            else
                System.out.println(" X");

            if (i % 7 == 0) System.out.println("");
            i = i + 1;
            curr = curr.next;
        }
        System.out.println("");
    }
}