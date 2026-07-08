class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int maxsum=n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        int missing=maxsum-sum;
        return missing;
        
    }
}
