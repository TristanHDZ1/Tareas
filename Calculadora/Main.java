public class Main {
    public static void main(String[] args) {



        System.out.println("\n Este es el primer autor ");
        Autor aut1 = new Autor("Ari","Gochi","Mexico");
        aut1.setNombre("Javier");
        System.out.println(aut1);
        aut1.escribir();
        aut1.promocionar();


        System.out.println("\n Este la editorial");
        Editorial edit1 = new Editorial("Mapi","Mexico","Fes aragon");

        System.out.println(edit1);
        edit1.publicar();



        System.out.println(" \n\nCalculadora \n\tSuma ");
        Calculadora calc = new Calculadora();
        calc.setOperando1(100);
        calc.setOperando2(6);
        int resultado = calc.sumar(calc.getOperando1(), calc.getOperando2());
        System.out.println("El resultado de la suma es : " + resultado);


        System.out.println("\n\tResta");
        Calculadora cal1 = new Calculadora();
        calc.setOperando1(6);
        calc.setOperando2(3);
        int resultado1 = calc.restar(calc.getOperando1(), calc.getOperando2());
        System.out.println("El resultado de la resta es : " + resultado1);

        System.out.println("\n\tMultiplicación");
        Calculadora cal2 = new Calculadora();
        calc.setOperando1(8);
        calc.setOperando2(8);
        int resultado2 = calc.multiplicar(calc.getOperando1(),calc.getOperando2());
        System.out.println("El resultado de la multiplicación es : " + resultado2);

        System.out.println("\n\tDivición");
        Calculadora cal3 = new Calculadora();
        calc.setOperando1(100);
        calc.setOperando2(10);
        int resultado3 = calc.division(calc.getOperando1(),calc.getOperando2());
        System.out.println("El resultado de la divición es: " + resultado3);

    }
}