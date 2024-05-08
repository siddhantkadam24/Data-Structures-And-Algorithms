
public class Main {
    public static void main(String[] args) {
        String s = "aabccba";
        StringBuilder sb = new StringBuilder();
        RemoveDuplicate r = new RemoveDuplicate();
        int i = 0;
        r.remDup(s, i, sb);
        System.out.println(sb);
    }
}
