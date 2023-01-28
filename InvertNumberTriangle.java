import java.util.Scanner;

class Main {
    public static void invNumTriangle(int max) {
        for(int line = max; line >= 1; line--) {
            System.out.println();
            for(int number = line; number >= 1; number--) {
                System.out.print(number);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max number: ");
        int max = sc.nextInt();
        
        invNumTriangle(max);
    }
}
