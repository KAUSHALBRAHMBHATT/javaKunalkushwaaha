package Basic2Questions;

public class OrderAgnosticBinaryS {
    public static void main(String[] args) {
        //ascending order array
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //distending order array
        int[] arr2 = {89, 45, 22, 18, 16,15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;

        int ans = ogBinarySearch(arr2, target);
        System.out.println(ans);
    }

    static int ogBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        boolean ascendArr = arr[start] < arr[end];

        while(start <= end){
            mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (ascendArr) {
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
