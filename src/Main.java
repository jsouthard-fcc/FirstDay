import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            // get the input
            int Nval = getIntegerInput();

            if (Nval >= 1) {
                int sum = sumOfSquares(Nval);
                System.out.println("The sum of the squares is: " + sum);
            } else {
                System.out.println(" Please enter a value at least 1");
            }
        } catch(  java.util.InputMismatchException ex ) {
            System.out.println("Please enter a numeric value, like 2");
        }
    }

    public static int sumOfSquares( int nval ) {
        int sum = 0;
        for (int i = 1; i <= nval; i++) {
            sum += i*i;
        }
        return sum;
    }

    public static int getIntegerInput() {
        System.out.print( "Please enter the number of squares: ");
        Scanner sc = new Scanner( System.in );
        return sc.nextInt();
    }
}