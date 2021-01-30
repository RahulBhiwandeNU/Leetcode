

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode tail = head;
        if(position == 0) {
            newNode.next = head;
            return newNode;
        }
        while(position  - 1 > 0) {
            tail = tail.next;
            position--;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        return head;

    }

