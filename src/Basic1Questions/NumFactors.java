package Basic1Questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NumFactors {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number to find it's factors: ");
        num = sc.nextInt();
        sc.close();

        int max = (int) (Math.sqrt(num) + 1);
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 2; i < max; i++) {
            if (num % i == 0) {
                al.add(i);
                al.add(num / i);
            }
        }
/*

        for(Integer element : al){
            System.out.println(element);
        }
*/

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(al);
        ArrayList<Integer> al2 = new ArrayList<>(lhs);
        System.out.println(al2);
    }
}
