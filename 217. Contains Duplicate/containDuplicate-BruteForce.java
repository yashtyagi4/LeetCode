//Utilize two for loops to search and compare
//Causes Time Exceed Error

//Time -> O(n^2)
//Space -> O(1)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}
