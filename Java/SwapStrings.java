public class SwapStrings {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        String temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
