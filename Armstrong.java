import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        int number, last, n, rem;

        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        for (int i = number; i > 0; i--) {
            n = i;
            last = 0;

            while (n > 0) {
                rem = n % 10;
                last = last + (rem * rem * rem);
                n = n / 10;
            }

            if (i == last) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}




