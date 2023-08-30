class Solution {
    public int[] replaceElements(int[] arr) {
         int n = arr.length;
        int maxVal = -1;
        int temp = 0;
        for(int i = n - 1; i >= 0; i--) {
            temp = maxVal;
            maxVal = Math.max(arr[i], maxVal);// return maximium of two numbers;
            arr[i] = temp;
        }   
        return arr;
    }
    
}
