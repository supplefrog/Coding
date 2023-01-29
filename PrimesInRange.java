import java.util.Scanner;
import java.lang.Math;

class Main {
    public static boolean isPrime(int num) {
        if (num == 1) {
            System.out.println("Neither prime nor composite");
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primesInInterval(int lb, int ub) {
        for (int n = lb; i <= ub; i++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lb, ub = -1;
        while (lb < 1) {
            System.out.println("Enter the lower bound (> 1): ");
            lb = sc.nextInt();
        }
        while (ub < 1) {
            System.out.println("Enter the upper bound (> 1): ");
            ub = sc.nextInt();
        }
        primesInInterval(lb, ub);
    }
}