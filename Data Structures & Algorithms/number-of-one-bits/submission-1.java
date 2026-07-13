class Solution {
    public int hammingWeight(int n) {
        int mask = 1;
        int bits = 0;
        for(int i = 0;i<=31;i++){
            int res = (mask & n);
            if(res != 0)bits++;
            mask = mask << 1;
        }
        return bits;
    }
}
