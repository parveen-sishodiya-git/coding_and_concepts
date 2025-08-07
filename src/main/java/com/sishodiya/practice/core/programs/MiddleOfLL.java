package main.java.com.sishodiya.practice.core.programs;

import java.util.List;

public class MiddleOfLL {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);
        ListNode node6 = new ListNode(60);

        // Link nodes together: node1 -> node2 -> node3 -> node4 -> node5 -> node6
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // Head of the list
        ListNode head = node1;
        System.out.print("Linked list: ");
        printLinkedList(head);
        findMiddleNode(head);
    }

    public static void findMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            System.out.println("In side loop");
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element is "+slow.data);
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
