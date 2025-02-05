class Solution {
    public boolean hasDuplicate(int[] nums) {
        int lengthOfNUms = nums.length;
        sort(nums);
        
        for (int i = 0; i < lengthOfNUms - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public static int[] sort(int[] nums) {
        int n = nums.length;
        boolean swapped;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] < nums[j + 1] ) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return nums;
    }
}
