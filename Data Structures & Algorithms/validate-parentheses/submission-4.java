class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(stack.peek() == '(' && ch == ')'){
                stack.pop();
            }
            else if(stack.peek() == '{' && ch == '}'){
                stack.pop();
            }
            else if(stack.peek() == '[' && ch == ']'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
