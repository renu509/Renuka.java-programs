import java.util.Scanner;
public class method {
    static int size = 0;
    static int[] arr = new int[20];
    static void insert(int pos, int value) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot insert!");
            return;
        }
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
        size++;
        System.out.println("Inserted " + value + " at position " + pos);
    }
    static void delete(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
            return;
        }
        int deleted = arr[pos];
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted element: " + deleted);
    }
    static void linearSearch(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found!");
    }
    static void binarySearch(int key) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found!");
    }
    static void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted successfully!");
    }
    static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Sort (Bubble Sort)");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    insert(pos, val);
                    break;
                case 2:
                    System.out.print("Enter position (0-based index): ");
                    int delPos = sc.nextInt();
                    delete(delPos);
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int key1 = sc.nextInt();
                    linearSearch(key1);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int key2 = sc.nextInt();
                    binarySearch(key2);
                    break;
                case 5:
                    bubbleSort();
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
