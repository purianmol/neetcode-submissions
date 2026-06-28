class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        StringBuilder rev = new StringBuilder(sb);
        sb.reverse();
        String str1 = sb.toString();
        String str2 = rev.toString();
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
