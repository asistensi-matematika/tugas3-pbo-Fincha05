
public class LinearEquation {
    private double a,b,c,d,e,f;
    
    public LinearEquation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        
    }
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    
    public boolean cekSolusi () {
        if (getA() * getD() - getB() * getC() == 0) {
            return false;
        }
        else { 
            return true;
        }  
    }
    public void cetak () {
        double x = ((getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC()));
        double y = ((getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC()));
        System.out.println("\nOutput : \n" + "Sistem persamaannya : ");
        System.out.println(a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);
        System.out.println("\nHasilnya : ");
        
        if (cekSolusi () == true) {
            System.out.println("x = " + String.format("%.2f",x) + ", y = " + String.format("%.2f",y));
        }
        else {
            System.out.println("Sistem tidak memiliki penyelesaian ");
        }
        
    } 
}

