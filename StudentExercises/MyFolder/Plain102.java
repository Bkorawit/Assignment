import java.util.Scanner;

public class Plain102 {
    public static void main(String[] args) {
        System.out.print("Hello, what is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ".  How do you do?");
    }
}
