class Solution {
    public String foreignDictionary(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<26;i++){
            list.add(new ArrayList<>());
        }
        int[] indegree = new int[26];
        boolean[] exists = new boolean[26];
        for(String word:words){
            for(char ch: word.toCharArray()){
                exists[ch-'a'] = true;
            }
        }
        int n = words.length;
        for(int i = 0;i<n-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            if(w1.length()>w2.length() && w1.startsWith(w2))return "";
            int len = Math.min(w1.length(),w2.length());
            for(int j = 0;j<len;j++){
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if(c1 != c2){
                    list.get(c1-'a').add(c2-'a');
                    indegree[c2-'a']++;
                    break;
                }
            }
        }
        // apply kahn's algorithm
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<26;i++){
            if(exists[i] && indegree[i] == 0){
                q.offer(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            int size = q.size();
                int k = q.poll();
                sb.append((char)('a'+k));
                for(int nei: list.get(k)){
                    indegree[nei]--;
                    if(indegree[nei] == 0) q.offer(nei);
                }
        }
        int total = 0;
        for(int i = 0;i<26;i++){
            if(exists[i])total++;
        }
        return sb.length() == total ? sb.toString():"";
    }
}
