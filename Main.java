import java.util.Scanner;
import example.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -------------------- Cuadrado --------------------
        Cuadrado cuadrado = new Cuadrado();
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        // -------------------- Rectángulo --------------------
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("\nIngrese la base del rectángulo: ");
        rectangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        // -------------------- Círculo --------------------
        Circulo circulo = new Circulo();
        System.out.print("\nIngrese el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo (circunferencia): " + circulo.calcularPerimetro());

        // -------------------- Triángulo --------------------
        Triangulo triangulo = new Triangulo();
        System.out.print("\nIngrese la base del triángulo: ");
        triangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del triángulo: ");
        triangulo.setAltura(scanner.nextDouble());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
