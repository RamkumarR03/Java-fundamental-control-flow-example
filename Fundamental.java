import java.util.Scanner;

class Fundamental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Check the numbers
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Switch case to print day of the week
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None");
                break;
        }

        // Print numbers from 0 to n using a for loop
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // Corrected while loop to count down from n to 0
        while (n != 0) {
            System.out.println(n);
            n--;
        }

        // Corrected do-while loop to print n only once
        do {
            System.out.println(n);
        } while (n > 3);
    }
}
