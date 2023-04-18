public class Vehiculo{
    protected String tipo;
    protected String dificultadManejar;
    protected int numeroLlantas;
    protected int capacidadAsientos;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String dificultadManejar, int numeroLlantas, int capacidadAsientos) {
        this.tipo = tipo;
        this.dificultadManejar = dificultadManejar;
        this.numeroLlantas = numeroLlantas;
        this.capacidadAsientos = capacidadAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultadManejar() {
        return dificultadManejar;
    }

    public void setDificultadManejar(String dificultadManejar) {
        this.dificultadManejar = dificultadManejar;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;

    }


    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", dificultadManejar='" + dificultadManejar + '\'' +
                ", numeroLlantas=" + numeroLlantas +
                ", capacidadAsientos=" + capacidadAsientos +
                '}';
    }

    public void Manipular(){
        System.out.println("Manipulando el vehiculo " + tipo);
    }

    public void Reparar(){
        System.out.println("Resparando el vehiculo " + tipo);
    }
}