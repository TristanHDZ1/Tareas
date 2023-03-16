public class Cpu {
    private String marca;
    private String modelo;
    private double frecuancia;

    public Cpu() {
    }

    public Cpu(String marca, String modelo, double frecuancia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frecuancia = frecuancia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrecuancia() {
        return frecuancia;
    }

    public void setFrecuancia(double frecuancia) {
        this.frecuancia = frecuancia;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frecuancia=" + frecuancia +
                '}';
    }
}
