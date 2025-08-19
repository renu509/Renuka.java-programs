import java.util.Scanner;
public class needle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();
        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();
        if (haystack.contains(needle)) {
            System.out.println("Needle found in haystack!");
        } else {
            System.out.println("Needle not found in haystack.");
        }
    }
}
