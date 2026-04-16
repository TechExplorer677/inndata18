import java.util.Scanner;
import java.util.logging.Logger;

public class ArregloNombres {
    private static final Logger logger = Logger.getLogger(ArregloNombres.class.getName());
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String [] nombres=new String[3];
        for (int i=0; i< nombres.length;i++){
            logger.info("Ingrese un nombre ");
            nombres[i]=teclado.nextLine();
        }
        //barrido
        for (int i=0; i< nombres.length;i++) {
            logger.info(nombres[i]);
        }
    }
}
