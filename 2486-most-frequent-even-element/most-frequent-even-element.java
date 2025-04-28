class Solution {
    public int mostFrequentEven(int[] nums) {
        int count=-1;
        int[] freq=new int[100001];
        for(int i:nums){
            if(i%2==0)
            freq[i]++;
        }
        int max=0;
        for(int i=0;i<100001;i++){
            if(i%2==0)
            if(freq[i]>max){
                max=freq[i];
                count=i;
            }
        }
        return count;
    }
}