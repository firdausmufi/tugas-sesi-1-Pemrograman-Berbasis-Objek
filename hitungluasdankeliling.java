public class hitungluasdankeliling {
    public static void main(String[] args) {
        double alas = 5;
        double tinggi = 6;

        double luas = 0.5 * alas * tinggi;
        double keliling = Math.sqrt(2 * Math.pow(alas, 2) + 2 * Math.pow(tinggi, 2));

        System.out.println("Luas segitiga adalah: " + luas);
        System.out.println("Keliling segitiga adalah: " + keliling);
    }
}