package Basic2Questions;

public class BinarySearch1 {
    public static void main(String[] args) {
        //ascending order array
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //distending order array
        int[] drr = {89, 45, 22, 18, 16,15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;
        int ans1 = binarySearch1(arr, target);
        System.out.println(ans1);
        int ans2 = binarySearch2(drr, target);
        System.out.println(ans2);
    }

    static int binarySearch2(int[] drr, int target) {
        int start = 0;
        int end = drr.length - 1;

        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;// end could be very large value for int, so paraphrasing

            if(target < drr[mid]){
                start = mid + 1;
            } else if (target > drr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
