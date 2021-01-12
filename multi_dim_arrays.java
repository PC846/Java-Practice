import java.util.Arrays;

public class multi_dim_arrays {
// 2 by 3 - 2 rows, 3 columns
    public static void main(String [] args) {
        int [][] numbers = new int[2][3];
        numbers [0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers_1 = {{1,2,3}, {2,4,5}}; //doesnt work for 3?
    }
    
}
