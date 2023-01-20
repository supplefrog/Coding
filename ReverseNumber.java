import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int num = sc.nextInt();
	
	int rem;
        /*
	int numlen = Integer.valueOf(num).toString().length();
        for (int i = 1; i <= numlen; i++) {
	    rem = num % 10;
	    num = num / 10;
            System.out.print(rem);
	}
	*/
	for (; num>0;) {
            rem = num % 10;
            num = num / 10;
            System.out.print(rem);
	}
    }
}
