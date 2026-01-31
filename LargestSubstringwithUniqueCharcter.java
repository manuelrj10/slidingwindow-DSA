import java.util.HashMap;
class LargestSubstringwithUniqueCharcter{
    public static void main(String args[]){
        String str="eceba";
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;//Shrinking window
        int right=0;//expanding window
        int max=0;
        for(right=0;right<arr.length;right++){
            char rchar=arr[right];
            map.put(rchar,map.getOrDefault(rchar,0)+1);

            while(map.get(rchar)>2){
                char lchar=arr[left];
                map.put(lchar,map.get(lchar)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
}