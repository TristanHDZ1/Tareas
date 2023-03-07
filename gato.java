import java.util.Scanner;

public class gato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres que solo contenga X, O o _: ");
        String input = scanner.nextLine().toUpperCase();
        while (!input.matches("[XO_]{9}")) {
            System.out.print("Entrada inválida. \n Intente nuevamente: ");
            input = scanner.nextLine().toUpperCase();
        }
        char[] chars = input.toCharArray();
        System.out.printf(" %c | %c | %c \n", chars[0], chars[1], chars[2]);
        System.out.println("---+---+---");
        System.out.printf(" %c | %c | %c \n", chars[3], chars[4], chars[5]);
        System.out.println("---+---+---");
        System.out.printf(" %c | %c | %c \n", chars[6], chars[7], chars[8]);
    }

}
