import java.sql.SQLOutput;
import java.util.Scanner;
public class RemoveSpecialChar {

    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        String plainstr = str.replaceAll("[^a-zA-Z0-9]", ""  );
        System.out.println(plainstr);
    }
}
