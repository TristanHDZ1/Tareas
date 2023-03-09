package ico.fes;

public class Giroscopio {
    private String material;
    private int angulo;
    private String orientacion;
    private String velocidad;

    public Giroscopio() {
    }

    public Giroscopio(String material, int angulo, String orientacion, String velocidad) {
        this.material = material;
        this.angulo = angulo;
        this.orientacion = orientacion;
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", angulo=" + angulo +
                ", orientacion='" + orientacion + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    public void Nivelar(){
        System.out.println("Se esta nivelando el giroscopio en un angulo " +angulo + " grados, en una orientacion " + orientacion + " a una velocidad " + velocidad);
    }
    public void Resistencia(){
        System.out.println("El giroscopio de material " + material + " puede soportar caidas");
    }
}
