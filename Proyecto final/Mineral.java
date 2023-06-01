package org.example.modelo;

public class Mineral {
    private int id;
    private String nombreDelMineral;
    private int dureza;
    private String conductor;
    private String luminoso;
    private String urlImagen;

    public Mineral() {
    }
    public Mineral(int id,
                   String nombreDelMineral,
                   int dureza,String conductor,
                   String luminoso,
                   String urlImagen){
        this.id=id;
        this.nombreDelMineral= nombreDelMineral;
        this.dureza= dureza;
        this.conductor= conductor;
        this.luminoso= luminoso;
        this.urlImagen= urlImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDelMineral() {
        return nombreDelMineral;
    }

    public void setNombreDelMineral(String nombreDelMineral) {
        this.nombreDelMineral = nombreDelMineral;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getLuminoso() {
        return luminoso;
    }

    public void setLuminoso(String luminoso) {
        this.luminoso = luminoso;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Mineral{" +
                "id=" + id +
                ", nombreDelMineral='" + nombreDelMineral + '\'' +
                ", dureza=" + dureza +
                ", conductor='" + conductor + '\'' +
                ", luminoso='" + luminoso + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                '}';
    }
}
