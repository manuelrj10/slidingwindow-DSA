class maxConsonentinK{
    public static void main(String[] args){
        String str="abciiidef";
        int k=3;
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<k;i++){
            if(arr[i]!='a'&&arr[i]!='u'&&arr[i]!='o'&&arr[i]!='i'&&arr[i]!='e'){
                count++;

            }
        }
        int maxcount=count;
        for(int j=k;j<arr.length;j++){
            int left=j-k;
            int right=j;
            if(arr[left]!='a'&&arr[left]!='u'&&arr[left]!='o'&&arr[left]!='i'&&arr[left]!='e'){
                count--;
            }
            if(arr[right]!='a'&&arr[right]!='u'&&arr[right]!='o'&&arr[right]!='i'&&arr[right]!='e'){
                count++;
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        System.out.println(maxcount);


    }
}