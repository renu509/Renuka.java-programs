import java.util.Scanner;
public class roman{
    public static int value(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
    public static int romanToInt(String roman) {
        int total = 0;
        int i = 0;
        while (i < roman.length()) {
            int s1 = value(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int s2 = value(roman.charAt(i + 1));
                if (s1 >= s2) {
                    total += s1;
                    i++;
                } else {
                    total += (s2 - s1);
                    i += 2;
                }
            } else {
                total += s1;
                i++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int number = romanToInt(roman);
        System.out.println("Numeric value: " + number);
        sc.close();
    }
}
