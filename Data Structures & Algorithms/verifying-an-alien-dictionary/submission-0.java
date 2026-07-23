class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        if(n == 1) return true;
        Map<Character,Integer> map = new HashMap<>();
        int index = 0;
        for(char letter:order.toCharArray()){
            map.put(letter,index++);
        }
        for(int i = 1;i<n;i++){
            int j = 0;
            String a = words[i-1];
            String b = words[i];
            int alen = a.length();
            int blen = b.length();
            while(j< alen && j<blen){
                int a_index = map.get(a.charAt(j));
                int b_index = map.get(b.charAt(j));
                if(a_index != b_index){
                    if(a_index>b_index) return false;
                    else break;
                }
                j++;
            }
            if(j == blen) return false;
        }
        return true;
    }
}