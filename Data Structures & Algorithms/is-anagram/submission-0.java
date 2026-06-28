class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map.equals(map2)){
            return true;
        }
        else{
            return false;
        }
    }
}
