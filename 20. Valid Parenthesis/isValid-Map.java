//Using Stack and Map
class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<>();
        Map<Character,Character> map = Map.of('(',')','[',']','{','}');

        for (char c : s.toCharArray()){
            if(map.containsKey(c)) S.push(c);
            else {
                if(S.isEmpty()) return false;
                if( map.get(S.peek()) == c ) S.pop();
                else return false;
                }
            } 
        if (S.isEmpty()) return true;
        return false;
    }
}
