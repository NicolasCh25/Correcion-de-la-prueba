package example;

public class Cuadrado {
    // Atributo para el lado del cuadrado
    private double lado;

    // Método getter para obtener el valor del lado
    public double getLado() {
        return lado;
    }

    // Método setter para establecer el valor del lado
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
