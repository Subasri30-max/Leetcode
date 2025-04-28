class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int max=0;
        for(int i=0;i<101;i++){
            max=Math.max(max,freq[i]);
        }
        for(int i=0;i<101;i++){
            if(freq[i]==max){
                count+=max;
            }
        }
        return count;
    }
}