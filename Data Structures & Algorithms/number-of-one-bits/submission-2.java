class Solution {
    public int hammingWeight(int n) {
        int set_bits = 0;
        for(int i = 0;i<32;i++){
            if((n & 1<<i) != 0)set_bits++;
        }
        return set_bits;
    }
}
