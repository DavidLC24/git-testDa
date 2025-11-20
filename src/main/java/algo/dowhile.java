package algo;
import java.util.Scanner;
public class dowhile {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int XXX;
            do {
                System.out.println("Calculator");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplica");
                System.out.println("4. Salir");
                XXX = sc.nextInt();
                sc.nextLine();
                if (XXX == 1) {
                    System.out.println("Introduce un numero");
                    int Aaa = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce otro");
                    int Bbb = sc.nextInt();
                    sc.nextLine();

                    System.out.println("La suma es " + (Aaa + Bbb));
                } else if (XXX == 2) {
                    System.out.println("Introduce un numero");
                    int n1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce otro");
                    int n2 = sc.nextInt();
                    sc.nextLine();
                    int n3 = n1 - n2;
                    System.out.println("La resta es " + n3);
                } else if (XXX == 3) {
                    System.out.println("Introduce un numero");
                    int NUM1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce otro");
                    int NUM2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("La multiplicacion es " + NUM1 * NUM2);
                }        } while (XXX != 4);
        }
}
