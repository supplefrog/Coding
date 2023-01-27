//Prime - two factors
//Composite - more than two factors
import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void isPrime(num) {
	boolean isPrime = true;
	for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (num < 0) {
            System.out.println("Number must be natural");
        }
        else if (num == 0 || num == 1) {
            System.out.println("neither");
        }
        else if (isPrime == false) {
            System.out.println("composite");
        }
        else {
            System.out.println("is prime");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int num = sc.nextInt();
	isPrime(num);
    }
}
