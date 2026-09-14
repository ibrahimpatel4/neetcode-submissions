class Solution {
    public int[] twoSum(int[] nums, int target) {

        int total = 0;
        int firstnum = 0;
        int secondnum = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                total = 0;
                total = nums[i] + nums[j];

                if(total > target){
                    total = 0;
                }
                else if (total == target && i != j){
                    if(i < j){
                        firstnum = i;
                        secondnum = j;
                    }
                    else{
                        firstnum = j;
                        secondnum = i;
                    }
                }
            }
        }

        int[] num = new int[2];
        num[0] = firstnum;
        num[1] = secondnum;

        return num;
        
    }
}
