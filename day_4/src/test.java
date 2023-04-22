public class test {
    public static void main(String[] args) {
        String s = "1234";
//        String format = String.format("%07d", Integer.valueOf(s));
        String format = String.format("%7s",s);
        System.out.println(format);
    }
}
