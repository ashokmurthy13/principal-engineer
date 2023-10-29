package Coding.TwoPointers;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[][] numsList = {
                { 3, 7, 1, 2, 8, 4, 5 },
                { -1, 2, 1, -4, 5, -3 },
                { 2, 3, 4, 1, 7, 9 },
                { 1, -1, 0 },
                { 2, 4, 2, 7, 6, 3, 1 }
        };
        int[] targets = { 10, 7, 20, -1, 8 };

        for (int i = 0; i < numsList.length; i++) {
            boolean isPresent = sumOfThreeValues(numsList[i], targets[i]);
            System.out.println(isPresent);
        }
    }

    // TimeComplexity : O(n^2)
        // sorting the array takes O(nlog(n)) 
        // the nested loop takes O(n^2) to find the triplet. 
        // Here, n is the number of elements in the input array.
        // Therefore, the total time complexity of this solution is O(nlog(n)+n^2), which simplifies to O(n^2).
    // SpaceComplexity : O(1)
    static boolean sumOfThreeValues(int[] nums, int target) {
        // sort the array
        Arrays.sort(nums);

        for (int idx = 0; idx < nums.length - 2; idx++) {
            int left = idx + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[idx] + nums[left] + nums[right];
                if (target == sum) {
                    return true;
                } else if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                }
            }
        }

        return false;
    }
}
