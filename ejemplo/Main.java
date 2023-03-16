public class Main {
    public static void main(String[] args) {
        System.out.println("Cumpudabo");
        computadora comp1 = new computadora();
        computadora comp2 = new computadora(
                "Active cool",
                "Patito",
                new monitor(),
                new mouse(),
                new teclado(),
                new Cpu()
        );
        System.out.println(comp1);
        System.out.println("\n");
        System.out.println(comp2);
        computadora comp3 = new computadora(
                "Hp",
                "Pavilion 5000",
                new monitor("Hp","HpView", 21.1),
                new mouse("Logitech","G 300","gamer"),
                new teclado("logitech","LT3000",1,2),
                new Cpu("intel","i9",8.5)
        );
        System.out.println(comp3);
        comp3.getProcesador().setFrecuancia(4.6);
        System.out.println(comp3);

        comp3.getRaton().setTipo("de oficina");
        System.out.println(comp3);

        comp3.setKeyboard(new teclado("Gamefactor","k400",2,3));
        System.out.println(comp3);

    }
}