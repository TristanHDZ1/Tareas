import org.w3c.dom.ls.LSOutput;

public class Automovil extends Vehiculo {
    private String marca;
    private String anioEstreno;
    private int capacidadLitros;
    private int velocidad;

    public Automovil() {
    }

    public Automovil(String tipo, String dificultadManejar, int numeroLlantas, int capacidadAsientos, String marca, String anioEstreno, int capacidadLitros, int velocidad) {
        super(tipo, dificultadManejar, numeroLlantas, capacidadAsientos);
        this.marca = marca;
        this.anioEstreno = anioEstreno;
        this.capacidadLitros = capacidadLitros;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(String anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", anioEstreno='" + anioEstreno + '\'' +
                ", capacidadLitros=" + capacidadLitros +
                ", velocidad=" + velocidad +
                ", tipo='" + tipo + '\'' +
                ", dificultadManejar='" + dificultadManejar + '\'' +
                ", numeroLlantas=" + numeroLlantas +
                ", capacidadAsientos=" + capacidadAsientos +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo auto marca " + marca + " ....");
    }

    public void apagar(){
        System.out.println("Apagando el auto " + marca + " ....");
    }

   //Sobre escritura para vehiculo implementada

    @Override
    public void Manipular() {
        System.out.println("Manipulando el automovil " + marca);
    }
}

