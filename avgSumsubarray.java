
import java.util.Arrays;


// k = 3
class minSumsubarray{
    public static void main(String args[]){
        int[] arr={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        float[] result=new float[arr.length-k+1];
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        result[0]=sum/k;
        for(int j=k;j<arr.length;j++){
            sum+=arr[j]-arr[j-k];
            System.out.println(sum);
            result[j-k+1]=(float)sum/k;
        }
        System.out.println(Arrays.toString(result));

    }
}