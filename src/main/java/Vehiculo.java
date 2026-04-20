public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual = 0;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }
  
    public void acelerar(int incremento) {
        if (this.velocidadActual + incremento > this.velocidadMaxima) {
            this.velocidadActual = this.velocidadMaxima;
        } else {
            this.velocidadActual += incremento;
        }
    }
}
