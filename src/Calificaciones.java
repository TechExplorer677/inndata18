import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double[][] cals= new double[3][4];
        double cal;
        for(int i=0;i<cals.length;i++){
            System.out.println("Ingresa las calificaciones del alumno "+ (i+1));
            for(int j=0;j<cals[i].length; j++){
                System.out.println("Ingresa la calificacion "+ (j+1));
                cal=entrada.nextDouble();
                cals[i][j]=cal;
            }
        }

        for(double[] alumno:cals){
            System.out.println("Calificaciones alumno ");
            for(double cali:alumno){
                System.out.print(cali +" ");
            }
            System.out.println(" ");
        }
    }
}