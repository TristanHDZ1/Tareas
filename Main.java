import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n Automovil");
        Automovil auto1 = new Automovil("Nissan", "Skylan", (byte) 63, "Azul");
        System.out.println(auto1);
        auto1.encender();
        auto1.apagar();
        auto1.estacinando();

        //Separacion
        System.out.println("\n Persona");
        Persona p1 = new Persona(19, "Javier", 1.75, 73.3, "Masculino");
        System.out.println(p1);
        p1.comer();
        p1.tomar();
        p1.bañar();

        //Separacion
        System.out.println("\n Monitor");
        Monitor m1 = new Monitor(14.2,"LG","3570Lg","Oled", 15.799);
        System.out.println(m1);
        m1.encender();
        m1.apagar();
        m1.proyectar();

        //Separacion

        System.out.println("\n Guitarra");
        Guitarra g1 = new Guitarra("Yamaha",6,"Electrica","Negro Mate");
        System.out.println(g1);
        g1.tocar();
        g1.guardar();
        g1.conectar();


    }
}