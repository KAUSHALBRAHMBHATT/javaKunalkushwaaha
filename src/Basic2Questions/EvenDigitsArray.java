package Basic2Questions;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigitsArray {
    public static void main(String[] args) {
        int[] arr = {12, 234, 4, 7, 1789, 34};
        System.out.println(findNumbers(arr));

        System.out.println(digits2(1234));

        System.out.println(Math.log10(9999));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int element: arr){
            if (even(element)) {
                count++;
            }
        }
        return count;
    }

    //To check if the number has even digits or not
    static boolean even(int element) {

        return digits(element) % 2 == 0;

    }

    //count number of digits in a given num
    static int digits(int element){
        //check for negative and zero digits
        if (element < 0) {
            element *= -1;
        }
        if (element == 0) {
            return 0;
        }

        int c = 0;
        while(element > 0){
            element = element / 10;
            c++;
        }
        return c;
    }

    //Optimized digits method
    static int digits2(int element){
        if (element < 0) {
            element *= -1;
        }
        return (int)(Math.log10(element) + 1);
    }
}
