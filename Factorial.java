//Condition for prime: two factors
//Composite: more than two factors
import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        if(sc.hasNextInt()) {
            num = sc.nextInt();
        }
        if (num > 1) {
            for (int num_minus = num - 1; num_minus > 1;) {
                num = num * num_minus;
                for (;num_minus > 1;) {
                    num_minus--;
                    break;    
                }
            }
        }
        else if (num < -1) {
            for (int num_plus = num + 1; num_plus <= -1;) {
                num = num * num_plus;
                for (;num_plus <= -1;) {
                    num_plus++;
                    break;    
                }
            }
        }
        else {
            num = 1;
        }
        System.out.println(num);
    }
}
