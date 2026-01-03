package neetcode;

import java.util.HashSet;
import java.util.Set;

import utils.TestUtil;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> existing = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (existing.contains(nums[i])) {
                return true;
            } else {
                existing.add(nums[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        TestUtil.run("Test Case #1", true, solution.hasDuplicate(new int[]{1, 2, 3, 3}));
        TestUtil.run("Test Case #2", false, solution.hasDuplicate(new int[]{1, 2, 3, 4}));
    }
}
