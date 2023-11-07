public class StringBuilderEx {
    public static void main(String[] args) {
        String p = "pippo";
        StringBuilder sb = new StringBuilder(p);
        sb.reverse();
        System.out.println(sb);
        System.out.println(p);
    }

}