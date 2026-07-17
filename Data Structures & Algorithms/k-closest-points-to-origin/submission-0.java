class Solution {
    static class Point{
        int x;
        int y;
        int d;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
            d = (x*x)+(y*y);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        int m = points.length;
        PriorityQueue<Point> q = new PriorityQueue<>((a,b) -> b.d - a.d);
        for(int[] arr: points){
            Point p = new Point(arr[0],arr[1]);
            q.offer(p);
            if(q.size()>k)q.poll();
        }
        int[][] ans = new int[k][];
        for(int i = 0;i<k;i++){
            Point pt = q.poll();
            ans[i] = new int[]{pt.x,pt.y};
        }
        return ans;
    }
}
