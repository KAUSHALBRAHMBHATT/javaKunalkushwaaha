package Basic1Questions;

import java.util.ArrayList;

public class NumLC1281 {
    public static int subtractProductAndSum(int n) {
        ArrayList<Integer> al = new ArrayList<>();

        int multipl = 1;
        int addit = 0;
        while(n > 0){
            al.add(n % 10);
            n = n / 10;
        }

        for (int element : al){
            multipl *= element;
            addit += element;
        }
        int total = multipl - addit;
        return total;

    }

    public static void main(String[] args) {
        int n = 234;
        int total = subtractProductAndSum(n);
        System.out.println(total);
    }
}
/*
 Better code:

 class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0)
        {
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return pro-sum;
    }
}
 */
/*
Optimized Code:
int sum(int n)
{
	return n < 2 ? n : n % 10 + sum(n / 10);
}

int product(int n)
{
	return n < 2 ? 1 : n % 10 * product(n / 10);
}

int subtractProductAndSum(int n)
{
	return product(n) - sum(n);
}
 */


