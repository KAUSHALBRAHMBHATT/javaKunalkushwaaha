package Basic1Questions;

import java.util.Scanner;

public class Fibo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp, a = 0;
        int b = 1;
        int count = 2;

        while (count <= num){
            temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Fibonacci number at " + num + " position is " + b);
    }
}
