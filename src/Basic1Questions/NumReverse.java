package Basic1Questions;

public class NumReverse {
    public static void main(String[] args) {
        int num = 123456;
        int new_num = num;
        int reminder = 0;
        int temp = 0;
        while (num > 0){
            reminder = num % 10;
            num = num / 10;
            temp = (temp * 10) + reminder;
        }

        System.out.println(new_num);
        System.out.println(temp);
    }
}
