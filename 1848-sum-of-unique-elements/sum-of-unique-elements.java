class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=0;i<101;i++){
            if(freq[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}