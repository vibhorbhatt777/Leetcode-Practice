class Solution {
public:
    int helper(int n){
        if(n<=1) return 1;
        int op1 = helper(n-1);
        int op2 = helper(n-2);
        return  op1 + op2;
    }
    int climbStairs(int n) {
       // memset(dp,-1,sizeof(dp));
        int ans = helper(n);
        return ans;
        
    }
};
