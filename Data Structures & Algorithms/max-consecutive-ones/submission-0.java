class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int counter = 0;
        int highest = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter++;
                if(counter > highest){
                    highest = counter;
                }
            }
            else if (counter > highest)
            {
                highest = counter;
                counter = 0;
            }
            else{
                counter = 0;
            }
        }

        return highest;
        
    }
}