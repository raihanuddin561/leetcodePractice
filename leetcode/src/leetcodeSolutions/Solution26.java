package leetcodeSolutions;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        int c = 0, k = 1;
        if(nums.length==1) return 1;
        if(nums.length==2){
            if(nums[0]==nums[1]) return 1;
            else return 2;
        }
        for (int i = 0; i < nums.length; i++) {
            c++;
            if (c < nums.length) {
                while (c < nums.length && nums[i] == nums[c]) {
                    c++;
                }
                if (c < nums.length && nums[i] != nums[c]) {
                    nums[i + 1] = nums[c];
                    k++;
                }
            }

        }

        return k;
    }

    public void test() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
