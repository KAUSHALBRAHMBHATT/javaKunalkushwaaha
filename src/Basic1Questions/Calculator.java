package Basic1Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result = 0;
        repeat:
        while(true){
            System.out.println("Enter the operation(+, -, *, /, %): ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

                System.out.print("Enter two numbers: ");
                float a = sc.nextFloat();
                float b = sc.nextFloat();

                if (ch == '+') {
                    result = a + b;
                } else if (ch == '-') {
                    result = a - b;
                } else if (ch == '*') {
                    result = a * b;
                } else if (ch == '/') {
                    if (b == 0){
                        System.out.println("invalid input");
                        continue repeat;
                    }
                    result = a / b;
                } else if (ch == '%') {
                    result = a % b;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("invalid input");
                continue repeat;
            }
            System.out.println(result);
        }
    }
}
