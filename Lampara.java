package ico.fes;

public class Lampara {
    private String marca;
    private String forma;
    private int tamaño;
    private int voltage;

    public Lampara() {
    }

    public Lampara(String marca, String forma, int tamaño, int voltage) {
        this.marca = marca;
        this.forma = forma;
        this.tamaño = tamaño;
        this.voltage = voltage;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", forma='" + forma + '\'' +
                ", tamaño=" + tamaño +
                ", voltage=" + voltage +
                '}';
    }

    public void Prender(){
        System.out.println("Prendiendo la lampara " + marca);
    }
    public void Apagar(){
        System.out.println("Apagando la lampara " + marca);
    }
    public void Instalando(){
        System.out.println("Instalando lampara " + marca + " en la habitacion, con un voltage de " + voltage + " y una forma " + forma);
    }
}
