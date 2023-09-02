class Solution {
public:
    int findNonMinOrMax(std::vector<int>& nums) {
        int n = nums.size();
        if (n < 3) {
            return -1;
        }
        
        int minVal = nums[0];
        int maxVal = nums[0];
        
        for (int i = 1; i < n; i++) {
            minVal = std::min(minVal, nums[i]);
            maxVal = std::max(maxVal, nums[i]);
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != minVal && nums[i] != maxVal) {
                return nums[i];
            }
        }
        
        return -1;
    }
};
