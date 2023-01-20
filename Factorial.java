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
        if (num > 1) {
            for (int num_minus = num - 1; num_minus > 1; num--) {
                num = num * num_minus;
            }
        }
        else if (num < -1) {
            for (int num_plus = num + 1; num_plus <= -1; num_plus++) {
                num = num * num_plus;
            }
        }
        else {
            num = 1;
        }
        System.out.println(num);
    }
}
