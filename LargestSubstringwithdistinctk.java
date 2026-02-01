import java.util.HashMap;
class LargestSubstringwithdistinctk{
    public static void main(String[] args) {
        String str="eceba";
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int max=0;
        for(right=0;right<arr.length;right++){
            char rkey=arr[right];
            map.put(rkey,map.getOrDefault(rkey,0)+1);

            while(map.size()>2){
                char lkey=arr[left];
                map.put(lkey,map.get(lkey)-1);
                if(map.get(lkey)==0){
                    map.remove(lkey);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }


}