package ico.fes;

import java.util.concurrent.Callable;

public class main {
    public static void main(String[] args) {
        System.out.println("\n\t\tPaís");
        Pais pais1 = new Pais("Brasil", "Brasilia", "Portugues", 214000000);
        System.out.println(pais1);
        pais1.Votar();
        pais1.Guerra();
        pais1.Manipulacion();

//separacion
        System.out.println("\n\t\tGiroscopio");
        Giroscopio giroscopio1 = new Giroscopio("Titanio", 45, "Norte", "0.01 m/s");
        System.out.println(giroscopio1);
        giroscopio1.Nivelar();
        giroscopio1.Resistencia();

//separacion
        System.out.println("\n\t\tComputadora");
        Computadora comp1 = new Computadora("Intel Core i9-12900HK",65,"liquido","RTX4090","Lenovo",8,504);
        System.out.println(comp1);
        comp1.Encender();
        System.out.println("\n");
        comp1.Apagar();
        System.out.println("\n");
        comp1.Rendimiento();

//separacion
        System.out.println("\n\t\tCubo Rubik");
        CuboRubik cubo1 = new CuboRubik("predeterminados","Heshu","3X3");
        cubo1.Armar();
        cubo1.Revolver();

//separacion
        System.out.println("\n\t\tLibro");
        Libro lib1 = new Libro(1000,"\"La Comunidad del Anillo\"","J. R. R. Tolkien","ciencia ficcion");
        lib1.Leer();
        lib1.Subrayar();
        lib1.Traducir();

//separacion
        System.out.println("\n\t\tBalón");
        Balon bal1 = new Balon("Futbol","NIKE","esponja",5);
        bal1.Practicar();
        bal1.Desinflar();
        bal1.Ponchar();

//separacion
        System.out.println("\n\t\tLámpara");
        Lampara lamp1 = new Lampara("LG","estandar",17,220);
        lamp1.Prender();
        lamp1.Apagar();
        lamp1.Instalando();

//separacion
        System.out.println("\n\t\tGato");
        Gato cat1 = new Gato("Angora","frondoso","Atun y Salmón",17);
        cat1.Comer();
        cat1.Bañar();
    }
}
