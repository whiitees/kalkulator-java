import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Zakończ");

            System.out.print("Twój wybór (wpisz numer operacji): ");
            String wybor = scanner.nextLine();

            if (wybor.equals("5")) {
                System.out.println("Do widzenia!");
                break;
            }

            if (wybor.matches("[1-4]")) {
                System.out.print("Podaj pierwszą liczbę: ");
                double liczba1 = scanner.nextDouble();
                System.out.print("Podaj drugą liczbę: ");
                double liczba2 = scanner.nextDouble();
                scanner.nextLine();  // Odczyt zbędnych znaków nowej linii

                switch (wybor) {
                    case "1":
                        System.out.println("Wynik: " + dodawanie(liczba1, liczba2));
                        break;
                    case "2":
                        System.out.println("Wynik: " + odejmowanie(liczba1, liczba2));
                        break;
                    case "3":
                        System.out.println("Wynik: " + mnozenie(liczba1, liczba2));
                        break;
                    case "4":
                        System.out.println("Wynik: " + dzielenie(liczba1, liczba2));
                        break;
                }
            } else {
                System.out.println("Błędny wybór. Wybierz ponownie.");
            }
        }
    }

    public static double dodawanie(double a, double b) {
        return a + b;
    }

    public static double odejmowanie(double a, double b) {
        return a - b;
    }

    public static double mnozenie(double a, double b) {
        return a * b;
    }

    public static double dzielenie(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Nie można dzielić przez zero");
            return Double.NaN;  // NaN oznacza "Not a Number"
        }
    }
}
