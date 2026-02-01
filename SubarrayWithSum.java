class SubarrayWithSum{
    public static void main(String args[]){
        int[] arr={2, 3, 1, 2, 4, 3};
        int k=7;
        int sum=0;
        int max=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                int leftkey=arr[left];
                sum=sum-leftkey;
                left++;
            }
            if(sum<=k){
                max=Math.max(max,right-left+1);
            }
        }
        System.out.println(max);
    }
}