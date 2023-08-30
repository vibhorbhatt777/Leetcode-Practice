class Solution {
    public String reverseWords(String s) {
        
        String[] str=s.trim().split(" ");
        String str1="",vb="";
        
        for(int i=str.length-1;i>=0;i--){
            vb=(i!=0) ? " " : "";
            if(str[i]!="")
                str1+=str[i]+vb;
        }
        
        return str1;
        
    }
}
//String[] str = s.trim().split(" ");

//The input string s is trimmed to remove any leading and trailing spaces.
//Then, it is split into an array of substrings using the space character (" ") as the delimiter.
//The result is stored in the array str. Each element of this array represents a word from the input string.
//String str1 = "", vb = "";

//Two empty strings, str1 and vb, are initialized. str1 will be used to build the reversed string, and vb is used to control the spacing between words.
//The variable vb is assigned a space (" ") if i is not the index of the first word (to add space between words), otherwise it remains empty.
//The condition if (str[i] != "") checks if the current word is not empty (it's a safety check to avoid adding extra spaces).
//If the condition is met, the current word str[i] and the value of vb (which might be an empty string or a space) are concatenated to the str1 string.
