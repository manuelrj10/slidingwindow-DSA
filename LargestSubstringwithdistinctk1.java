import java.util.HashMap;
class LargestSubstringwithdistinctk1{
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="aaabbcc";
        char[] arr=str.toCharArray();
        int k=2;
        int left=0;
        int right=0;
        int max=0;
        
        for(right=0;right<arr.length;right++){
            char rightchar=arr[right];
            map.put(rightchar,map.getOrDefault(rightchar,0)+1);
            
            while(map.size()>k){
                char leftchar=arr[left];
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            if(map.size()==k){
                max=Math.max(max,right-left+1);
            }


        }
        System.out.println(max);
        
    }
}