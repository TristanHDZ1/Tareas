package ico.fes;

public class Pais {
    private String nombre;
    private String capital;
    private String idioma;
    private int poblacion;


    public Pais() {
    }

    public Pais(String nombre, String capital, String idioma, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", idioma='" + idioma + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public void Votar (){
        System.out.println("Entrando a estado democratico en el pais " + nombre);

    }

    public void Guerra(){
        System.out.println("Entra en guerra el pais " + nombre + " con un numeros de soldados estimado a la poblacion de " + poblacion);

    }

    public void Manipulacion(){
        System.out.println("El pais " + nombre + " esta siendo manipulado por el gobierno ");

    }

}
