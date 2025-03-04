public class Main {
    static String in = "I love  Java Programming";

    public static void main(String[] args) {
        revStr();
    }

    static void revStr() {
        int len = in.length() - 1;
        int x = 0;
        String re = "";
        String w = "";
        boolean space = false;
        char c;
        for (int i = len; i >= 0; i--) {
            c = in.charAt(i);  
            if (c != ' ') {
                w = c + w;
                space = false;
            } else if (!space) {
                re += w + " ";
                w = "";
                space = true;
            }
        }
        re += w;
        System.out.println(re);
    }
}
