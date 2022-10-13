public class contentEquals {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello")); // true
        System.out.println(myStr.contentEquals("e")); // false
        System.out.println(myStr.contentEquals("Hi")); // false
    }
}
