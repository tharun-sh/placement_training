import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String temp = new String();
        char digit;
        int i = in.length()-1;
        while(i >= 0) {
            digit = in.charAt(i);
            temp += (digit);
            i--;
        }
        if(temp.equals(in)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
