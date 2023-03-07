import java.util.ArrayList;
public class Guitarra {
    private String marca;
    private int cuerdas;
    private String tipo;
    private String color;

    public Guitarra() {
    }

    public Guitarra(String marca, int cuerdas, String tipo, String color) {
        this.marca = marca;
        this.cuerdas = cuerdas;
        this.tipo = tipo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "marca='" + marca + '\'' +
                ", cuerdas=" + cuerdas +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean tocar(){
        System.out.println("Tocando guitarra " + marca);
        return true;
    }

    public boolean guardar(){
        System.out.println("Guardando guitarra " + marca);
        return true;
    }

    public boolean conectar(){
        System.out.println("Conectando guitarra " + marca);
        return true;
    }
}
