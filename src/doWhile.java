import java.util.Scanner;

public class doWhile {
        //psvm
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
            int opcion=0;
            do{
                System.out.println("¿Que opcion deseas?");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Estoy sumando");
                        break;
                    case 2:
                        System.out.println("Estoy restando");
                        break;
                    case 3:
                        System.out.println("Estoy multiplicando");
                        break;
                    case 4:
                        System.out.println("Estoy dividiendo");
                        break;
                    case 5:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion no existente");
                }
            }while (opcion !=5);
        }
    }