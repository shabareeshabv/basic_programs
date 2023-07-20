
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 8 input values");

        System.out.println("Enter the value");
        String value1 = sc.nextLine();
        System.out.println("Enter the value");
        String value2 = sc.nextLine();
        System.out.println("Enter the value");
        String value3 = sc.nextLine();
        System.out.println("Enter the value");
        String value4 = sc.nextLine();
        System.out.println("Enter the value");
        String value5 = sc.nextLine();
        System.out.println("Enter the value");
        String value6 = sc.nextLine();
        System.out.println("Enter the value");
        String value7 = sc.nextLine();
        System.out.println("Enter the value");
        String value8 = sc.nextLine();

        String[] reference = { value1, value2, value3, value4, value5, value6, value7, value8 };

        System.out.println("Enter the index value");
        int reference1 = sc.nextInt();
System.out.printf(" index value of %d "+reference1);
        System.out.println("Array value is: " + reference[reference1]);
		

     	   
    }
}
