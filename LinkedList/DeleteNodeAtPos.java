

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode tail = head;
        if (position == 0) {
            head = head.next;
        }
        while (position - 1 > 0) {
            tail = tail.next;
            position--;
        } 
        SinglyLinkedListNode ahead = tail.next.next;
        tail.next = ahead;
        return head;
    }

