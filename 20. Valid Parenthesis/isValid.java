//Using Stack
class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();

        for (char c : s.toCharArray()){
            if(s.length()%2 != 0) return false;
            if(c == '(' || c == '{' || c == '[') S.push(c);
            else {
                if(S.isEmpty()) return false;
                else{
                    if(c == ')' && S.peek() == '(') S.pop();
                    else if(c == '}' && S.peek() == '{') S.pop();
                    else if(c == ']' && S.peek() == '[') S.pop();
                    else return false;
                }
            }
        }

        if (S.isEmpty()) return true;
        return false;
    }
}
