package Basic1Questions;

public class NumArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,4,233,-3,35,-7,58};

        int ans1 = min(arr);
        int ans2 = max(arr);

        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int min(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        int ans = arr[0];
        for (int element : arr){
            if (element < ans) {
                ans = element;
            }
        }
        return ans;
    }

    static int max(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        int ans = arr[0];
        for (int element : arr){
            if (element > ans) {
                ans = element;
            }
        }
        return ans;
    }
}
