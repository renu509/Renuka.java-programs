import java.util.Scanner;
class Queue {
    int front, rear, size, capacity;
    int[] arr;
    Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    boolean isFull() {
        return size == capacity;
    }
    boolean isEmpty() {
        return size == 0;
    }
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + value);
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        System.out.println(value + " inserted.");
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to delete.");
            return;
        }
        int deleted = arr[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) { // reset queue when empty
            front = -1;
            rear = -1;
        }
        System.out.println(deleted + " deleted.");
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        int count = size;
        int i = front;
        while (count-- > 0) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue: ");
        int n = sc.nextInt();
        Queue q = new Queue(n);
        int choice;
        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek (Front)");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
