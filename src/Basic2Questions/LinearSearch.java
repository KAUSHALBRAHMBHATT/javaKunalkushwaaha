package Basic2Questions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {2,45,23,56,78,222,34,52,67,89};
        int target = 78;

        int ans1 = linearSearch1(num,target);
        System.out.println(ans1);

        //check for number between a certain index range
        int start = 1;
        int end = 7;

        int ans2 = linearSearch2(num,target,start,end);
        System.out.println(ans2);
    }

    static int linearSearch1(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
