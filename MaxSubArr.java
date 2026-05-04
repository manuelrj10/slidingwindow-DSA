class MaxSubArr{
    public static void main(String[] args){
        class Solution {
    public int maxSubArray(int[] nums) {
       
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int low=0;low<n;low++){
            sum+=nums[low];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }


        }
        return max;
        
        
    }
}

    }
}