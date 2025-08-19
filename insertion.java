import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position (0 to " + size + "): ");
        int pos = sc.nextInt();
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

