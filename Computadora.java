package ico.fes;

public class Computadora {
    private String procesador;
    private int ram;
    private String enfriamineto;
    private String grafica;
    private String marca;
    private int nucleos;
    private int almacenamiento;


    public Computadora() {
    }

    public Computadora(String procesador, int ram, String enfriamineto, String grafica,String marca, int nucleos, int almacenamiento) {
        this.procesador = procesador;
        this.ram = ram;
        this.enfriamineto = enfriamineto;
        this.grafica = grafica;
        this.marca = marca;
        this.nucleos = nucleos;
        this.almacenamiento = almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getEnfriamineto() {
        return enfriamineto;
    }

    public void setEnfriamineto(String enfriamineto) {
        this.enfriamineto = enfriamineto;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", ram='" + ram + '\'' +
                ", enfriamineto='" + enfriamineto + '\'' +
                ", grafica='" + grafica + '\'' +
                "marca='" + marca + '\'' +
                ", nucleos=" + nucleos +
                ", almacenamiento=" + almacenamiento +
                '}';
    }

    public void Encender(){
        System.out.println("Enciende computadora " +marca+ "\nCargando\n..........  \nIniciar sesion: ");
    }
    public void Apagar(){
        System.out.println("Apaga computadora " + marca + "\nCargando\n.......... \nCerrando programas \nApagando");
    }

    public void Rendimiento(){
        System.out.println("La computadora " +marca  + " esta jalando al 100% por su procesador " + procesador + " ,su RAM de " + ram + " GB,  enfriamiento " + enfriamineto + " ,con grafica  " + grafica + " y sus nucleos " + nucleos);
    }
}
