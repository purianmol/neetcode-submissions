class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb = new StringBuilder();
       // 4#neet4#code4#love3#love
       for(String str: strs){
        sb.append(str.length());
        sb.append('#');
        sb.append(str);
       }
       String encoded = sb.toString();
       return encoded;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int len = 0;
        int count = 0;
        char[] arr = str.toCharArray();

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == '#'){
               // list.add(str.substring(i+1,len));
               String word = new String(arr,i+1,len);
                list.add(word);
                i+= len;
                len = 0;
                continue;
            }
            int num = arr[i]-'0';
            len = (len * 10) + num;
        }
        return list;
    }
}
