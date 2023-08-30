class Solution {
public:
    long long countOperationsToEmptyArray(vector<int>& nums) {
         long long cnt = 1;// for counting answer
        int n = nums.size();
        vector <pair <int,int>> res;
        for(int i = 0; i < n; i++) {
            res.push_back({nums[i], i});
        }
        sort(res.begin(), res.end());// sorting
        int j = 2;
        //checking weather condition is matched
        for(int i = n - 2; i >= 0; i--) {
            if(res[i].second > res[i + 1].second) {
                cnt += j;
            }
            else {
                cnt += 1;
            }
            j += 1;
        }
        return cnt;
    }
};
        
