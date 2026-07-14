    class Solution {
        static Map<Integer,String> map = new HashMap<>();
        int n;
        List<String> list = new ArrayList<>();
    static{ 
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return list;
        n = digits.length();
        backtrack(digits,"");
        return list;    
    }
    void backtrack(String str,String ans){
        if(str == ""){
            if(ans.length() == n)list.add(ans);
            return;
        }
        int num = str.charAt(0)-'0';
        String s = map.get(num);
        for(char ch:s.toCharArray()){
        backtrack(str.substring(1),ans+ch);
        backtrack(str.substring(1),ans);
        }
    }
}
