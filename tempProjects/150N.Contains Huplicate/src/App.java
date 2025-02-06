public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] numsNoDuplicates = new int[10];
        int[] nums = {1,2,3,3};
        for (int i = 0; i < 10; i++) {
            
            numsNoDuplicates[i] = i;
        }
        System.out.println(solution.hasDuplicate(nums));
        System.out.println(solution.hasDuplicate(numsNoDuplicates));
        
        for (int i : numsNoDuplicates) {
            System.out.print(String.valueOf(i));
        }
        System.out.println();
    }
}
