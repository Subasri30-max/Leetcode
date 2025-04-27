class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int row=0;
            for(int j=0;j<accounts[0].length;j++){
               row+=accounts[i][j];
            }
            if(row>sum)
            sum=row;
        }
        return sum;
    }
}