class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        for(String str: operations){
            if(str.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(str.equals("C"))st.pop();
            else if(str.equals("D"))st.push(2*st.peek());
            else{
                int num = Integer.parseInt(str);
                st.push(num);
            }
        }
        int sum = 0;
        while(!st.isEmpty())sum+=st.pop();
        return sum;
    }
}