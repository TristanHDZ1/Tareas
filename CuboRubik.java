package ico.fes;

public class CuboRubik {
    private String colores;
    private String nombre;
    private String tamaño;

    public CuboRubik() {
    }

    public CuboRubik(String colores, String nombre, String tamaño) {
        this.colores = colores;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "colores='" + colores + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
    public void Armar(){
        System.out.println("Armando cubo rubik " + tamaño + " marca " + nombre);
    }
    public void Revolver(){
        System.out.println("Desarmando cubo rubik " + tamaño + " marca " + nombre);
    }
}
