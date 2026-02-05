import java.util.HashMap;
class LongestRepeatingCharacter{
    public static void main(String args[]){
        String str="AABABBA";
        char[] arr=str.toCharArray();
        int k=1;
        int left=0;
        int maxlen=0;
        int maxcharcount=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<arr.length;right++){
            char rchar=arr[right];
            map.put(rchar,map.getOrDefault(rchar,0)+1);
            maxcharcount=Math.max(maxcharcount,map.get(rchar));
            while((right-left+1)-maxcharcount>k){
                char lchar=arr[left];
                map.put(lchar,map.get(lchar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println(maxlen);


    }
}