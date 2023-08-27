<<<<<<< HEAD
// 1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.

import java.util.*;

public class Q01 {
    static class Node { // creating node class
        int data;
        Node next;
    }

    static class LinkedList { // creating node LinkedList class
        Node head;

        public void add(int element) { // insertion
            Node n = new Node();
            n.data = element;
            n.next = null;
            if (head == null) {
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
            }
        }

        public boolean search(int k) { // traversing
            Node p;
            p = head;
            while (p != null) {
                if (p.data == k)
                    return true;
                else
                    p = p.next;
            }
            return false;
        }

    }

    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);
        LinkedList llist = new LinkedList(); // creating object
        int i = 0;
        while (i >= 0) {
            int item = sc.nextInt();
            if (item == -1) {
                break;
            }
            llist.add(item); // adding element onto the list
            i++;
        }
        int k = sc.nextInt();
        boolean res = llist.search(k);
        System.out.println(res);
    }

}
=======
// 1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.

import java.util.*;

public class Q01 {
    static class Node { // creating node class
        int data;
        Node next;
    }

    static class LinkedList { // creating node LinkedList class
        Node head;

        public void add(int element) { // insertion
            Node n = new Node();
            n.data = element;
            n.next = null;
            if (head == null) {
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
            }
        }

        public boolean search(int k) { // traversing
            Node p;
            p = head;
            while (p != null) {
                if (p.data == k)
                    return true;
                else
                    p = p.next;
            }
            return false;
        }

    }

    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);
        LinkedList llist = new LinkedList(); // creating object
        int i = 0;
        while (i >= 0) {
            int item = sc.nextInt();
            if (item == -1) {
                break;
            }
            llist.add(item); // adding element onto the list
            i++;
        }
        int k = sc.nextInt();
        boolean res = llist.search(k);
        System.out.println(res);
    }

}
>>>>>>> 4e16ffaa01296d49afa2e8e1d3f70261a4dd6dd0
