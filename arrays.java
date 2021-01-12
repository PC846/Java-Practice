// Arrays have a fixed length
import java.util.Arrays;


public class arrays {
    public static void main(String [] args) {
        int [] numbers = new int[5];
        
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
       
        System.out.println(Arrays.toString(numbers));  //method implemented multiple times = method overloading -- leaving 


        //newer ways

        int [] nums = {2,3,6,5,1,4};
        Arrays.sort(nums);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
