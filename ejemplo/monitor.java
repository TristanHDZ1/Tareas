public class monitor {
    private String marca;
    private String modelo;
    private double pulgada;

    public monitor() {
    }

    public monitor(String marca, String modelo, double pulgada) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgada = pulgada;
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

    public double getPulgada() {
        return pulgada;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public String toString() {
        return "monitor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pulgada=" + pulgada +
                '}';
    }
}
