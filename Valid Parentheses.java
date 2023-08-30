class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                cnt++;
            } else {
                if (stack.isEmpty()) return false;
                char ch = stack.pop();
                if ((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == ']' && ch == '[') || (s.charAt(i) == '}' && ch == '{')) {
                } else {
                    return false;
                }
                cnt--;
            }
        }
        return cnt == 0;
    }
}
