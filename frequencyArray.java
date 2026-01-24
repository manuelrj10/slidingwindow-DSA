class frequencyArray{
    public static void main(String[] args) {
        
        String str="malayalam";
        int[] frq=new int[26];
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            frq[index]++;
        }
        for(int i=0;i<frq.length;i++){
            if(frq[i]>0){
                char ch=(char) (i+'a');
                System.out.println(ch+":"+frq[i]);

            }
        }


    }
}