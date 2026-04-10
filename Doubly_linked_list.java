class Main {
    static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
