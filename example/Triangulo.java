package example;

public class Triangulo {
    private double base;
    private double altura;

    // Métodos getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return base + altura + hipotenusa;
    }
}
