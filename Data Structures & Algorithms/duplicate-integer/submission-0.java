class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int a : nums){
            numbers.add(a);
        }

        if(nums.length == numbers.size()){
            return false;
        }
        else{
            return true;
        }
        
    }
}