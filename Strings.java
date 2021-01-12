public class Strings {

    public static void main(String[] args) {
        String message = "Hello World"; // Strings are ref types in Java
        System.out.println(message);

        String message_1 = "Hello World" + "!!"; //concat
        System.out.println(message_1.endsWith("!!")); //one of the methods for Strings ; returns a boolean value
        System.out.println(message_1.length()); //returns length of string

        System.out.println(message_1.indexOf("sky")); //returns -1 index doesn't exist
        System.out.println(message_1.replace("!", "*")); //parameters are the holes that we define in our methods; arguments are the actual values that we pass to these methods
                                                       // target & replacement are parameters ; ! and * are argu
                                                       
        String message_2 = "                           Howdy                  ";                                               
        System.out.println(message_2.trim());    
        
        String message_3 = "Hello \"person\"";
        String PATHs = "c:\nWidows\\...";
    }
    
}
