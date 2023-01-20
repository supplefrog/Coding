class Main {
    public static void main(String args[]) {
        for(int line = 1; line <= 4; line++) { //condition works like an if (conditional) statement to break the loop
            for(int star = 4; star >= line; star--) { //mutable variable in condition changes the no of times loop runs
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
