
import java.util.HashMap;


class SubarraysWithExactlyKDistinctIntegers{
        public static void main(String args[]){
        int k = 2;
        int[] nums = {1,2,1,2,3};
        System.out.println(atmost(nums, k) - atmost(nums, k - 1));
        }
        public static  int atmost(int[] nums,int k){
         int left=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            int rht=nums[right];
            map.put(rht,map.getOrDefault(rht, 0)+1);
           
            while(map.size()>k){
                int lft=nums[left];
                map.put(lft,map.get(lft)-1);
                if(map.get(lft)==0){
                    map.remove(lft);
                }
                left++;
            }
            
                 count+=right-left+1;
        }
       return count;
    }

       
    }