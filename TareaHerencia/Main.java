public class Main {
    public static void main(String[] args) {
        System.out.println("\n Ejemplo de Vehiculo");
        Vehiculo v1 = new Vehiculo("Carro","Mediana",4,5);
        System.out.println(v1);
        v1.Manipular();
        v1.Reparar();
        v1.setTipo("Bicicleta");


        System.out.println("\n Ejemplo 2 Automovil Herencia");
        Automovil auto1 = new Automovil("Automovil","Mediana",4,5,"Jeep"," Año 2023",56,250);
        System.out.println(auto1);
        auto1.Manipular();
        auto1.encender();
        auto1.apagar();

        System.out.println("\n Ejemplo 3 de Taxi con Herencia a Automovil");
        Taxi taxi1 = new Taxi("Automovil","Mediana",4,5,"Tsuru Tuneado","Año 2000",40,180,"$30 pesos","Uber",5);
        System.out.println(taxi1);
        taxi1.Manipular();
        taxi1.Reparar();
        taxi1.Pelear();
        taxi1.CaldelViaje();





    }
}