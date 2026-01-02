package leetcode;

import java.util.HashSet;
import java.util.Set;

import utils.TestUtil;

public class RepeatedNTimes {
    private int solveWithLinearTimeAndMemoryComplexity(int[] nums) {
        Set<Integer> existing = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (existing.contains(nums[i])) {
                return nums[i];
            }
            existing.add(nums[i]);
        }
        return -1;
    }
    public int repeatedNTimes(int[] nums) {
        return solveWithLinearTimeAndMemoryComplexity(nums);
    }
    public static void main(String[] args) {
        RepeatedNTimes solution = new RepeatedNTimes();

        TestUtil.run("Test Case #1", 3, solution.repeatedNTimes(new int[]{1, 2, 3, 3}));
        TestUtil.run("Test Case #2", 2, solution.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        TestUtil.run("Test Case #3", 5, solution.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }
}
