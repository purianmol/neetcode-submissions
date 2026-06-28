class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Frequency> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(new Frequency(entry.getKey(),entry.getValue()));
        }
        list.sort((a,b) -> Integer.compare(b.frequency,a.frequency));
        for(int i = 0;i<k;i++){
            Frequency f = list.get(i);
            ans.add(f.element);
        }
        int[] result = new int[k];

        // 2. Copy elements from the list 'ans' to the array 'result'
        for (int i = 0; i < k; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
class Frequency{
    int frequency;
    int element;

    Frequency(int element,int frequency){
        this.element = element;
        this.frequency = frequency;
    }
}
