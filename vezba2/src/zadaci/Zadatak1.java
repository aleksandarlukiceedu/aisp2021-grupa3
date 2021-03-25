package zadaci;

public class Zadatak1 {

    public static int primer1(int n){
        return n*(n-1)/2;
    }

    public static double primer2(double r, double a){
        double cos = Math.cos(a);
        double sin = Math.sin(a);

        double cos2 = Math.pow(cos, 2);
        double sin2 = Math.pow(sin, 2);

        return Math.sqrt(r * cos2  + r * sin2);
    }

    public static void main(String[] args){
        int z1 = Zadatak1.primer1(5);
        System.out.println(z1);

        double z2 = Zadatak1.primer2(0.5, Math.PI/2);
        System.out.println(z2);
    }
}
