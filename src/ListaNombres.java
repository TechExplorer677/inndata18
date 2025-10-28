import java.util.ArrayList;
import java.util.List;

public class ListaNombres {
    public static void main(String[] args) {
        //Inicializando una lista vacia
        List <String> listaNombres = new ArrayList<>();
        //Añadiendo datos
        listaNombres.add("Marisela");//0
        listaNombres.add("Ana");//1
        listaNombres.add("Esther");//2
        System.out.println(listaNombres);
        listaNombres.add(1,"Oscar"); //[Marisela, Oscar,Esther] [Marisela, Oscar,Ana,Esther]
        listaNombres.add("Angel");
        System.out.println(listaNombres);//[Marisela, Oscar, Ana, Esther, Angel]
        if(listaNombres.contains("Marisol")){
            System.out.println("Marisol esta en la lista");
        }else{
            System.out.println("Marisol no esta en la lista");
        }
        System.out.println(listaNombres.get(1));
        listaNombres.set(0,"Mario");
        System.out.println(listaNombres);
        for(String n:listaNombres){
            System.out.println(n);
        }
    }
}
