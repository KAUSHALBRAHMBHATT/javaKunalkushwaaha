package Basic2Questions;

public class SearchCharInString {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'e';
        boolean ans1 = searchStr1(str, ch);
        boolean ans2 = searchStr2(str, ch);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static boolean searchStr1(String str, char target){
        if (str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (target == c) {
                return true;
            }
        }

        return false;
    }

    static boolean searchStr2(String str, char target){
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
