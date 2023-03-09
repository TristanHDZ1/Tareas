package ico.fes;

public class Libro {
    private int paginas;
    private String titulo;
    private String autor;
    private String categoria;

    public Libro() {
    }

    public Libro(int paginas, String titulo, String autor, String categoria) {
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "paginas=" + paginas +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", Categoria='" + categoria + '\'' +
                '}';
    }
    public void Leer(){
        System.out.println("Leyendo el libro " + titulo + " del autor " + autor + " categoria " + categoria );
    }
    public void Subrayar(){
        System.out.println("Subrayando el libro " + titulo + " con un total de paginas de " + paginas);
    }
    public void Traducir(){
        System.out.println("Traduciendo el libro " + titulo + " del autor " + autor + " a mi idioma");
    }

}
