import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);
        int opcion;

        System.out.println("¿Que opción deseas? Ingresa 5 para salir");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                //llamando a la funcion
                System.out.println(suma(5,8,3,10,20,30,40,-1));
                //Utilizando el metodo
                Calculadora micalculadora= new Calculadora();
              //  System.out.println(micalculadora.sumar(80,90));
                break;
            case 2:
                System.out.println("Estoy restando");
                break;
            case 3:
                System.out.println("Estoy multiplicando");
                break;
            case 4:
                System.out.println("Estoy dividiendo");
                try{
                    int num1;
                    int num2;
                    System.out.println("Ingresa el numero 1");
                    num1= entrada.nextInt();
                    System.out.println("Ingresa el numero 2");
                    num2= entrada.nextInt();
                    float resultado;
                    resultado= num1/num2;
                    System.out.println(resultado);

                } catch (ArithmeticException e) {
                    //throw new RuntimeException(e);
                    System.out.println("No se puede dividir entre 0");
                } catch (Exception e) {
                    System.out.println("Ingresaste una letra");
                }finally{
                    System.out.println("Fin del programa");
                }
                break;
            case 5:
                System.out.println("Fin del programa.Hasta luego");
                break;
            default:
                System.out.println("Esa no es una opción");
                break;

        }


    }
    //Metodo estatico o funcion
    static double suma(double... numeros){
        double suma=0;
        for(double num:numeros){
            suma+=num;
        }
        return suma;
    }

    //Metodo
    public double sumar(double n1, double n2){
        return n1+n2;
    }
}