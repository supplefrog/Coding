import java.util.Scanner;

class Main {
    public static void reverse(int num) {
	for (; num > 0; num /= 10) {
	    int rem = num % 10;
            System.out.print(rem);
	}
    }	    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println();
        reverse(num);
    }
}
