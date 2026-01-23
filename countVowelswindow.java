class countVowelswindow{
    public static void main(String args[]){
        String str="abciiidef";
        char[] arr=str.toCharArray();
        int k=3;
        int count=0;
        for(int i=0;i<k;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count++;
            }
        }
        int maxcount=count;
        for(int j=k;j<arr.length;j++){
            int last=j;
            int first=j-k;
            if(arr[first]=='a'||arr[first]=='e'||arr[first]=='i'||arr[first]=='o'||arr[first]=='u'){
                count--;
            }
            if(arr[last]=='a'||arr[last]=='e'||arr[last]=='i'||arr[last]=='o'||arr[last]=='u'){
                count++;
            }
            
            if(maxcount<count){
                maxcount=count;
            }
           

        }
        System.out.println("max vowel count is"+maxcount);
    }
}