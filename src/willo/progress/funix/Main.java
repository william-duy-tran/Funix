package willo.progress.funix;

import willo.progress.funix.willo.progress.funix.recursion.Factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      boolean quite = false;
      while(!quite) {
        System.out.print("Enter number to calculate factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long fac = Factorial.factorialWithInterative(n);
        System.out.println(String.format("n! of %d is: %d", n, fac));
        System.out.print("To quit type 1, anything to continue");
        int next = scanner.nextInt();
        if (next == 1) quite = true;
      }
    }
}
