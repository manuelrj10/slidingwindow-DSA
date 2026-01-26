

class Longsubstringk{
    public static void main(String args[]){
        String str = "abccabc";
        int freq[] =new int[26];
        int k=3;
        int uniq=0;
        
        for(int i=0;i<k;i++){
            int index=str.charAt(i) - 'a';
            if(freq[index]==0){
                uniq++;
            }
            freq[index]++;
        }
        int max=(uniq==k)?k:0;
        int count=0;
        for(int j=k;j<str.length();j++){
            int left=j-k;
            int leftIndex=str.charAt(left)-'a';
            freq[leftIndex]--;
            if(freq[leftIndex]==0){
                uniq--;
            }
            int right=j;
            int rightIndex=str.charAt(right)-'a';
            
            if(freq[rightIndex]==0){
                uniq++;
            }
            freq[rightIndex]++;
            if(uniq==k){
                count++;
                max=uniq;
                
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}