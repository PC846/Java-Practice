//explaining how certain objects have different methods
// age doesn't have methods but now does by use of the "." operator.  "age" is primitave and "now" is not
// ref types -- complex objects
// prim - simple objects
//x and y are independent due to memory
//reference types are copied by their references, primi by value
import java.util.Date;

public class Ref_types {
    public static void main(String[] args) {
        byte age = 22;
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;

    }
}
