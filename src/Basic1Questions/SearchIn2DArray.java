package Basic1Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {13,23,45},
                {33,56},
                {2,78,24,89}
        };

        int target = 89;
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));

        int min = searchMin(arr);
        int max = searchMax(arr);
        System.out.println(min);
        System.out.println(max);
    }

    static int[] searchIn2D(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int searchMin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }

    static int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
