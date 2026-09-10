class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int current = 0;

        for(int a : nums){
            ans[current] = nums[current];
            current++;
        }
        int index = current;
        current = 0;
        for(int a : nums){
            ans[index] = nums[current];
            index++;
            current++;
        }

        return ans;
        
    }
}