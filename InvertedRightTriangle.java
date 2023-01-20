import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        //input
        Scanner sc = new Scanner(System.in);
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        }
        //code
        /*
        for(int line = 1; line <= num; line++) {
            for(int star = num; star <= num - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        for(int line = 1; line <= num; line++) { //condition works like an if (conditional) statement to break the loop
            for(int star = num; star >= line; star--) { //mutable variable in condition changes the no of times loop runs
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
