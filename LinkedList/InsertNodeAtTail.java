

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null) {
            return newNode;
        }
        SinglyLinkedListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
        return head;
    }

