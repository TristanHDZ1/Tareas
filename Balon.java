package ico.fes;

public class Balon {
    private String deporte;
    private String marca;
    private String material;
    private int tamaño;

    public Balon() {
    }

    public Balon(String deporte, String marca, String material, int tamaño) {
        this.deporte = deporte;
        this.marca = marca;
        this.material = material;
        this.tamaño = tamaño;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "deporte='" + deporte + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public void Practicar(){
        System.out.println("Practicando con el balon de " + deporte + " de tamaño " + tamaño);
    }
    public void Desinflar(){
        System.out.println("Desinflando el balon de " + deporte + " marca " + marca);
    }
    public void Ponchar(){
        System.out.println("Ponchando el balon de " + deporte + " de material " + material);
    }
}
