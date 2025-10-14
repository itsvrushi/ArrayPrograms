package Arrays;

public class SumOfSubArray {

			
static int subarraySum(int[] arr) {
        
        
        int sum=0;
        
        
        for (int i = 0; i < arr.length; i++) {
        	int temp=0;
            for (int j = i; j < arr.length; j++) {
 
                temp += arr[j];
                sum += temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(subarraySum(arr));
    }
	
	
}
