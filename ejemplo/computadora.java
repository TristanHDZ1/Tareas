public class computadora {
    private String marca;
    private String modelo;
    private monitor pantalla;
    private mouse raton;
    private teclado keyboard;
    private Cpu procesador;

    public computadora() {
    }

    public computadora(String marca, String modelo, monitor pantalla, mouse raton, teclado keyboard, Cpu procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.keyboard = keyboard;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(monitor pantalla) {
        this.pantalla = pantalla;
    }

    public mouse getRaton() {
        return raton;
    }

    public void setRaton(mouse raton) {
        this.raton = raton;
    }

    public teclado getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(teclado keyboard) {
        this.keyboard = keyboard;
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pantalla=" + pantalla +
                ", raton=" + raton +
                ", keyboard=" + keyboard +
                ", procesador=" + procesador +
                '}';
    }
}
