package main.java.com.sishodiya.practice.core.programs;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        boolean firstNode = true;
        ListNode head = null;
        Scanner in = new Scanner(System.in);
        String more = "n";
        do {
            System.out.println("Enter data in list node ");
           
            // int data = 5;
            int data = in.nextInt();
            in.nextLine();
            ListNode newNode = new ListNode(data);
            newNode.next = null; 
            if(firstNode){
                head = newNode;
                firstNode = false;
            }else{
                addNodeIntoLinkedList(head,newNode);
            }    
            System.out.println("Want to add more node y/n?");

            more = in.nextLine();
            System.out.println(more);
        } while (more.equals("y"));
        System.out.println("Here is your list ");
        ListNode itr = head;
        while (itr.next !=null) {
            System.out.print(itr.data+" -> ");
            itr = itr.next;
        }
        System.out.print(itr.data);
//        reverseList(head);
    }

    public void reverseList(ListNode head){
        ListNode previous = head;
        ListNode current = head;
        if(current.next == null){
//            return head;
        }
        current = head.next;
        while (current.next != null) {
            ListNode nextNode = current.next;
            current.next = previous;
        }
    }

    public static void addNodeIntoLinkedList(ListNode head, ListNode newNode){
        ListNode node = head;
        ListNode lastNode = node;

        while (node.next != null) {
            node = node.next; 
            lastNode = node;
        }
        lastNode.next = newNode;
    }
}
