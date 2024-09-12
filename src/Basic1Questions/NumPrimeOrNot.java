package Basic1Questions;

import java.util.Scanner;

public class NumPrimeOrNot {
    public static void main(String[] args) {
    int num;
    int c = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to check if it as a prime number or not: ");
    num = sc.nextInt();
    sc.close();

    int max =  (int) (Math.sqrt(num) + 1);
    for(int i = 2; i <= max; i++) {
        if(num % i == 0) {
            System.out.println(num + " is not a prime number");
            c = 1;
            break;
        }
    }

    if(c == 0)
        System.out.println(num + " is a prime number");

    }
}
