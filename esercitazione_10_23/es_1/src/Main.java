import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Couple> data = new ArrayList<Couple>();
    public static void main(String[] args) {
        // reduce fa somme dei valori (accumulatore)
        // reduce(0, acc), 0 è il valore di partenza, acc è la funzione che fa incrementare
        int res1 = data.stream().filter(x -> x.val1 >= 0).map(x -> x.val2).reduce(0, (tot, x) -> tot = tot + x);
        int res2 = data.stream().filter(x -> x.val1 >= 0).reduce(0, (tot, x) -> tot.val2 = tot.val2 + x.val2);
    }
}
