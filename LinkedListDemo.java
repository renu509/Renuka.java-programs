import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
}
class LinkedList {
    Node head;
    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            System.out.println(value + " inserted.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println(value + " inserted.");
    }
    void delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Element " + value + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println(value + " deleted.");
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;
        do {
            System.out.println("\n--- Linked List Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int del = sc.nextInt();
                    list.delete(del);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
