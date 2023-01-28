import java.util.Scanner;

class Main {
    public static void reverse(int num) {
    	/*
	int numlen = Integer.valueOf(num).toString().length();
        for (int i = 1; i <= numlen; i++) {
            int rem = num % 10;
            num = num / 10;
            System.out.print(rem);
	}
	*/
	for (; num>0;) {
	    int rem = num % 10;
            num = num / 10;
            System.out.print(rem);
    }	    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println();
        reverse(num);
	}
    }
}
