class Main {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = head;   // last points to first

        // Display circular list
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.print("(back to head)");
    }
}
