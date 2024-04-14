package objetos;
public class Circulo {

    private float raio;
    private String cor;

    // Construtor
    public Circulo(float raio){
    this.raio = raio;
    this.cor = cor;
 }

    // Calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
