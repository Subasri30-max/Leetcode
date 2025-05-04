class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] freq=new int[100];
        int count=0;
        for(int[] d:dominoes){
            int key=Math.min(d[0],d[1])*10+Math.max(d[0],d[1]);
            count+=freq[key];
            freq[key]++;
        }
        return count;
    }
}
