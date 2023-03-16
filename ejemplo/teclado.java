public class teclado {
    private String marca;
    private String modelo;
    private int numeroSeTeclas;
    private int multimedia;

    public teclado() {
    }

    public teclado(String marca, String modelo, int numeroSeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSeTeclas = numeroSeTeclas;
        this.multimedia = multimedia;
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

    public int getNumeroSeTeclas() {
        return numeroSeTeclas;
    }

    public void setNumeroSeTeclas(int numeroSeTeclas) {
        this.numeroSeTeclas = numeroSeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "teclado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroSeTeclas=" + numeroSeTeclas +
                ", multimedia=" + multimedia +
                '}';
    }
}
