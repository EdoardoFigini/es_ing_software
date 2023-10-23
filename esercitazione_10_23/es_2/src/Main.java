import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    static  List<Integer> numeri = new ArrayList<Integer>();
    public static void main(String[] args) {
        Optional<Integer> found = numeri.stream().filter(x -> x % 2 == 0).findFirst();
        found.ifPresent(() -> {System.out.println(x));
        if(found.ifPresent()){
            System.out.println(found);
        }
    }
}
