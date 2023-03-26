public class Main {
    public static void main(String[] args) {
        System.out.println("Buenos dias , el dia de hoy hay solo Café Americano,Capuchino y Expreso, que desea tomar?");
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        // Servir algunos cafés
        System.out.println("\nTrabajando...\n");
        maquina.servirCafe("Americano");
        maquina.servirCafe("Capuchino");
        maquina.servirCafe("Expreso");
        // La suma de estos tres cafes da 400 ml de agua, de Cafe 49gr y de crema 70ml
        maquina.servirCafe("Americano");
        maquina.servirCafe("Expreso");
        maquina.servirCafe("Capuchino");
        // La segunda ronda

        System.out.println("\nCantidades sobrantes de los ingredientes\n");
        // Obtener la cantidad de ingredientes restantes
        int cantidadAgua = maquina.getCant_de_agua();
        int cantidadCafe = maquina.getCant_de_cafe();
        int cantidadCrema = maquina.getCant_de_crema();
        int cantidadVasos = maquina.getCantidadVasos();

        // Mostrar las cantidades de ingredientes restantes
        System.out.println("Cantidad de agua restante: " + cantidadAgua);
        System.out.println("Cantidad de cafe restante: " + cantidadCafe);
        System.out.println("Cantidad de Crema restanta: " + cantidadCrema);
        System.out.println(" Cantidad de vaoss restantes: " + cantidadVasos);
    }
}