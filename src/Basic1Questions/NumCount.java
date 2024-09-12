package Basic1Questions;

public class NumCount {
    public static void main(String[] args) {
        int num = 123431122;
        int count =0;
        int reminder = 0;

        while (num > 0){
            reminder = num % 10;
            if (reminder == 2) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
