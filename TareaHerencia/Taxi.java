public class Taxi extends Automovil {
    private String tarifaMin;
    private String localOaplicacion;
    private int calificacion;

    public Taxi() {
    }

    public Taxi(String tipo, String dificultadManejar, int numeroLlantas, int capacidadAsientos, String marca, String anioEstreno, int capacidadLitros, int velocidad, String tarifaMin, String localOaplicacion, int calificacion) {
        super(tipo, dificultadManejar, numeroLlantas, capacidadAsientos, marca, anioEstreno, capacidadLitros, velocidad);
        this.tarifaMin = tarifaMin;
        this.localOaplicacion = localOaplicacion;
        this.calificacion = calificacion;
    }

    public String getTarifaMin() {
        return tarifaMin;
    }

    public void setTarifaMin(String tarifaMin) {
        this.tarifaMin = tarifaMin;
    }

    public String getLocalOaplicacion() {
        return localOaplicacion;
    }

    public void setLocalOaplicacion(String localOaplicacion) {
        this.localOaplicacion = localOaplicacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "tarifaMin='" + tarifaMin + '\'' +
                ", localOaplicacion='" + localOaplicacion + '\'' +
                ", calificacion=" + calificacion +
                ", tipo='" + tipo + '\'' +
                ", dificultadManejar='" + dificultadManejar + '\'' +
                ", numeroLlantas=" + numeroLlantas +
                ", capacidadAsientos=" + capacidadAsientos +
                '}';
    }

    public void CaldelViaje(){
        System.out.println("Le damos " + calificacion+ " estrellas a el Taxi" );
    }
    public void Pelear(){
        System.out.println("El taxista choca y empiza de agravioso >:v ");
    }


    //Sobre escritura pero ahora para Automovil
    @Override
    public void encender() {
        System.out.println("El taxista enciende el auto para iniciar el viaje");
    }
}
