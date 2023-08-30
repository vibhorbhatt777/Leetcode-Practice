class Solution {
    public String removeDuplicates(String S) {
       Stack<Character> ans = new Stack();
        StringBuilder str = new StringBuilder();
        for(Character c: S.toCharArray()){
            if(ans.isEmpty()){
                ans.push(c);
            }
            else{
            if(ans.peek() != c){
                ans.push(c);
            }
            else if(!ans.isEmpty()){
                ans.pop();
            }
                }
        }
       
        while(!ans.isEmpty()){
            str.append(ans.pop());
        }
       
        return (str.reverse()).toString();
    }
}
// solution in c++:-class Solution {
//public:
  //  string removeDuplicates(string s) {
    //    string res = "";
      //  int n = s.size();
       // for(int i=0; i<n; i++)
        //{
          //  if(res.size()!=0 and res.back() == s[i])
            //    res.pop_back();
            //else
             //   res.push_back(s[i]);
        //}
        //return res;
    //}
//};
