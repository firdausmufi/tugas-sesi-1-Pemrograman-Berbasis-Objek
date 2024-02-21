public class Konversisuhu {
    public static void main(String[] args) {
        double reamur = 100;
        double celcius = (reamur - 32) * 5 / 9;
        double fahrenheit = reamur;
        double kelvin = celcius + 273.15;

        System.out.println("Suhu dalam reamur: " + reamur);
        System.out.println("Suhu dalam celcius: " + celcius);
        System.out.println("Suhu dalam fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam kelvin: " + kelvin);
    }
}