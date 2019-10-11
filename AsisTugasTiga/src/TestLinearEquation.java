
import java.util.Scanner;


public class TestLinearEquation {

    public static void main(String[] args) {
        Scanner fincha = new Scanner (System.in);
        System.out.print("Input : ");
        double a = fincha.nextDouble();
        double b = fincha.nextDouble();
        double c = fincha.nextDouble();
        double d = fincha.nextDouble();
        double e = fincha.nextDouble();
        double f = fincha.nextDouble();
        
        LinearEquation k = new LinearEquation(a, b, c, d, e, f);
        k.cetak();
        
    }
    
}
