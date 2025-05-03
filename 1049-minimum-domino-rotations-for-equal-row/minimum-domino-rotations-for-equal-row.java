class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res=check(tops[0],tops,bottoms);
        if(res!=-1)
        return res;
        return check(bottoms[0],tops,bottoms);
    }
    public int check(int val,int[] tops,int[] bottoms){
        int tc=0,bc=0;
        for(int i=0;i<tops.length;i++){
        if(tops[i]!=val&&bottoms[i]!=val){
            return -1;
        }
        else if(tops[i]!=val){
            tc++;
        }
        else if(bottoms[i]!=val){
            bc++;
        }
    }
    return Math.min(tc,bc);
    }
}