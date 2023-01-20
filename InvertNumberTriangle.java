import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the max number: ");
        int max = input.nextInt();

        System.out.println();
        for(int line = max; line >= 1; line--) {
            for(int number = line; number >= 1; number--) {
                System.out.print(number);
            }
        System.out.println();
        }
    }
}
