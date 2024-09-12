package Basic1Questions;

public class NumOperations {
    public static void main(String[] args) {
        int a = 153;
        int max = 2000;
        System.out.println(isArmstrong(a));
        printArmstrong(max);
    }

    static boolean isArmstrong(int n){
        int original = n;
        int reminder;
        int sum = 0;
        while(n > 0){
            reminder = n % 10;
            n /= 10;
            sum = sum + reminder*reminder*reminder;
        }
        return sum == original;
    }

    static void printArmstrong(int max){
        for (int i = 0; i < max; i++) {
            if (isArmstrong(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
