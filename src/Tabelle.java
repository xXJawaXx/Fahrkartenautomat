public class Tabelle {
    public static void main(String[] args) {
        System.out.printf("%-11s|%10s\n", "Fahrenheit", "Celsius");
        System.out.printf("----------------------\n");
        System.out.printf("%-11d|%10.2f\n", -20, -28.8889);
        System.out.printf("%-11d|%10.2f\n", -10, -23.3333);
        System.out.printf("%+-11d|%10.2f\n", 0, -17.7778);
        System.out.printf("%+-11d|%10.2f\n", 20, -6.6667);
        System.out.printf("%+-11d|%10.2f\n", 30, -1.1111);
    }
}
