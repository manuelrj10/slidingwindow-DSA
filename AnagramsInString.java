import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class AnagramsInString{
	public static void main(String args[]) {
		String str = "cbaebabacd";
		char[] strarr=str.toCharArray();
        HashMap<Character,Integer> window=new HashMap<>();
		
		String p = "abc";
		char[] parr=p.toCharArray();
        int k=parr.length;
        int have=0;
       
		List<Integer> lc=new ArrayList<>();
		HashMap<Character,Integer> pmap=new HashMap<>();
        for (char c : p.toCharArray()) {
            pmap.put(c, pmap.getOrDefault(c, 0) + 1);
        }
         int need=k;
        //first window
        for(int i=0;i<k;i++){
           char ch=strarr[i];
           window.put(ch,window.getOrDefault(ch,0)+1);
        }
        if(window.equals(pmap)){
            lc.add(0);
        }
        //second window
        for(int right=k;right<strarr.length;right++){
            char add=strarr[right];
            char remove=strarr[right-k];
            
            window.put(add,window.getOrDefault(add, 0)+1);
            window.put(remove,window.get(remove)-1);

            if(window.get(remove)==0){
                window.remove(remove);

            }
            if(window.equals(pmap)){
                lc.add(right-k+1);
            }
                    }
                    System.out.println(lc);

        }
	}
