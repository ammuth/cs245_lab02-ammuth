import java.util.*;

public class lab02 {
    public int [] twoSum(int[] sum, int target) {
        int i = 0;
        int j = sum.length-1;
        while (i < j) {
            if (sum[i] + sum[j] == target) {
                return new int[] {i, j};
            } else if (sum[i] + sum[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {-1};

    }

    public static void main(String[] args) {
        int[] example1 = {4,6,2,8,7};
        lab02 p1 = new lab02();
        System.out.println("Output is: "+Arrays.toString(p1.twoSum(example1,15)));
        System.out.println("Output is: "+Arrays.toString(p1.twoSum(example1,16)));



    }
}