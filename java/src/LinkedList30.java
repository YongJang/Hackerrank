/**
 * Created by USER on 2017-07-22.
 */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList30 {
    public static  Node insert(Node head,int data) {
        //Complete this method
        if (head == null) {
            head = new Node(data);
            return head;
        }

        Node start = head;
        while(start.next != null) {
            start = start.next;
        }
        start.next = new Node(data);
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("abcde");
        System.out.println(linkedList.get(0));
    }
}


