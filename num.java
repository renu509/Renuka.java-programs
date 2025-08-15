import java.util.Scanner;
public class num  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int total = 0, prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = 0;
            switch (roman.charAt(i)) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
            }
            if (value < prev)
                total -= value;
            else
                total += value;
            prev = value;
        }
        System.out.println("Numeric value: " + total);
        sc.close();
    }
}
