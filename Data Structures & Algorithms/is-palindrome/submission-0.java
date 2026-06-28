class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        String str = clean.toString();
        String reverse = clean.reverse().toString();

        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
}
