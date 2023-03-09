package ico.fes;

public class Gato {
    private String raza;
    private String pelaje;
    private String dieta;
    private int dVida;

    public Gato() {
    }

    public Gato(String raza, String pelaje, String dieta, int dVida) {
        this.raza = raza;
        this.pelaje = pelaje;
        this.dieta = dieta;
        this.dVida = dVida;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getdVida() {
        return dVida;
    }

    public void setdVida(int dVida) {
        this.dVida = dVida;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", dieta='" + dieta + '\'' +
                ", dVida=" + dVida +
                '}';
    }
    public void Comer(){
        System.out.println("El gato de " + raza+ "" + " come " + dieta);
    }
    public void Bañar(){
        System.out.println("El gato se baña laminedo su pelaje " + pelaje);
    }
}
