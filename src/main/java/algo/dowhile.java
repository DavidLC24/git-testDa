package algo;
import java.util.Scanner;
public class dowhile {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int option;
            do {
                System.out.println("Calculator");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplica");
                System.out.println("4. Salir");
                option = sc.nextInt();
                sc.nextLine();
                if (option == 1) {
                    add(sc);
                } else if (option == 2) {
                    subtraction(sc);
                } else if (option == 3) {
                    multiply(sc);
                }        } while (option != 4);
        }

    private static void multiply(Scanner sc) {
        System.out.println("Introduce un numero");
        int NUM1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce otro");
        int NUM2 = sc.nextInt();
        sc.nextLine();
        System.out.println("La multiplicacion es " + NUM1 * NUM2);
    }

    private static void subtraction(Scanner sc) {
        System.out.println("Introduce un numero");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce otro");
        int n2 = sc.nextInt();
        sc.nextLine();
        int n3 = n1 - n2;
        System.out.println("La resta es " + n3);
    }

    private static void add(Scanner sc) {
        System.out.println("Introduce un numero");
        int Aaa = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce otro");
        int Bbb = sc.nextInt();
        sc.nextLine();

        System.out.println("La suma es " + (Aaa + Bbb));
    }
}
