class Solution {
    public void reverseString(char[] s) {
        swap(s);
    }
    void swap(char[] str){
        int n = str.length;
        int s = 0;
        int e = n-1;
        while(s<e){
            char temp = str[s];
            str[s++] = str[e];
            str[e--] = temp;
        }
    }
}