class Solution {
    public int threeSumClosest(int[] nums, int target) {
         if (nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int leastDiff = Integer.MAX_VALUE;
        int closest = 0;
        for (int i = 0 ;i < nums.length - 2 ;i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    return sum;
                }
                else {
                    int diff = Math.abs(target - sum);
                    if (diff < leastDiff){
                        leastDiff = diff;
                        closest = sum;
                    }
                    if (sum > target){
                        k--;
                    }
                    else {
                        j++;
                    }
                }
            }
        }
        return closest;
    }
}
