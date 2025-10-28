import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Curps {
    public static void main(String[] args) {
        Set<String> curp= new TreeSet<>();
        curp.add("SACM870925");
        curp.add("SACM870925");
        curp.add("SACM870926");
        curp.add("SACM870902");
        System.out.println(curp);
        curp.remove("SACM870925");
        System.out.println(curp);
        curp.add("sacm870925");
        System.out.println(curp);

    }
}
