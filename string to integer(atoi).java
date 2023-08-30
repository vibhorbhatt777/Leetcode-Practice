class Solution {
    public int myAtoi(String str) {
        
        str = str.trim();
        
        if(str.isEmpty())  
            return 0;   // return 0 for an empty string
        
        boolean isPositive = true;
        long num = 0;
        
        // Condition for sign checking
        int i = 0;
        char firstChar = str.charAt(0);
        if(Character.isDigit(firstChar)) {
            i = 0;
            isPositive = true;
        }
        else if (firstChar == '+') {
            i = 1;
            isPositive = true;
        }
        else if (firstChar == '-'){
            i = 1;
            isPositive = false;
        }
        
        // Generating the number from the given condtion
        char c;
        for(; i < str.length(); i++) {
            c = str.charAt(i);          
            if(Character.isDigit(c) && num < Integer.MAX_VALUE)
                num = num * 10 + (c - '0');    
            else
                break;
        }
        
        
        if(!isPositive) 
            num *= -1;
        
        if(num < Integer.MIN_VALUE)        
            return Integer.MIN_VALUE;
        else if(num > Integer.MAX_VALUE)  
            return Integer.MAX_VALUE;
        else 
            return (int)num;
        
    }
}
