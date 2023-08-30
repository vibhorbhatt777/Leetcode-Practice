class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(Math.abs(nums[i] - i) > 1) return false;
        }
        return true;
    }
}
//Absolute value refers to the positive value corresponding to the number passed as in arguments. Now geek you must be wondering what exactly it means so by this it is referred no matter what be it positive or negative number been passed for computation, the computation will occur over the positive corresponding number in both cases.  So in order to compute the absolute value for any number we do have a specified method in Java referred to as abs()
