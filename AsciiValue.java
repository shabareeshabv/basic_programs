import java.util.Scanner;
class Ascii
{
public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
//char ch='b';
int ascii=ch;
System.out.println("The ASCII value of " + ch + " is: " + ascii);
}
}
