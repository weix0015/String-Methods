public class equalsIgnoreCase {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "HELLO";
        String myStr3 = "Another String";
        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
        System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
    }
}
