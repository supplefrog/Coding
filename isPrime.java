import java.util.Scanner;
import java.lang.Math;

class Main {
    public static class IntegerException extends Exception {
        public IntegerException(String message) {
            super(message);
        }
    }

    public static boolean isPrime(int num) throws IntegerException {
        if (num == 0 || num == 1) {
            throw new IntegerException("Neither prime nor composite");
        } 
        else if (num < 0) {
            throw new IntegerException("Enter a natural number");
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt();
        try {
            boolean isPrime = isPrime(num);
            if (isPrime) {
                System.out.println("Prime");
            } 
	    else {
                System.out.println("Composite");
            }
        } 
	catch (IntegerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
