package example;

public class Circulo {
    private double radio;

    // Método getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro (circunferencia)
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
