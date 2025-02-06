import java.util.HashSet;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int iterable : nums) {
            if (set.contains(iterable)) {
                return true;
            }
            set.add(iterable);
        }
        return false;
    }
}
