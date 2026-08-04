class Solution {
    public boolean canJump(int[] nums) {
        int maxInd = 0;
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            if(i>maxInd){
                return false;
            }
            else{
            maxInd = Math.max(maxInd, nums[i]+i);
            }
        }
        if(maxInd>=n-1){
            return true;
        }
        else{
            return false;
        }
    }

}