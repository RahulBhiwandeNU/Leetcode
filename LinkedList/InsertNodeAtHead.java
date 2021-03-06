

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(llist == null) {
            return newNode;
        }
        SinglyLinkedListNode tail = llist;
        while(newNode.next == null) {
            llist = newNode;
            llist.next = tail;
        }
        return llist;

    }

