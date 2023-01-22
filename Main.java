import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        double a, b = 0.0;
        int i=1;
        out.print("İşleminin yapılması istediğiniz sayıyı giriniz : ");
        a = input.nextDouble();
        do {
            b+=(1.0/i);
            i++;
        } while (i<=a);
        out.print(b);
    }
}
