import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        if(sc.hasNextInt()) {
            num = sc.nextInt();
        }
        boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime = false) {
            System.out.println("not prime");
        }
        else {
            System.out.println("is prime");
        }
    }
}
