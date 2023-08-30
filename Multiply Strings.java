class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) 
            return "0";
       int a = num1.length();
        int b = num2.length();
        int[] result = new int[a + b];// resultant array
        
        for (int i = a- 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = b - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                int sum = result[i + j + 1] + (x * y);
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (sb.length() != 0 || digit != 0) {
                sb.append(digit);
            }
        }
        
        return sb.toString();
    }
}
