public class Arreglos {
    public static void main(String[] args) {
        double [][] calificaciones={{7,5,10},{8,9,7},{8,7,9}};
        calificaciones[0][1]=8;
        //solo cuando se recorre un arreglo
        for(double[] fila: calificaciones) {
            for (double cal:fila){
                System.out.print(cal + ", ");
            }
            System.out.println(" ");
        }

        for(int fila=0; fila<3;fila++){
            System.out.println("Calificaciones alumno "+ (fila+1));
            for(int col=0; col<3; col++){
                System.out.println(calificaciones[fila][col]);
            }
        }

    }
}