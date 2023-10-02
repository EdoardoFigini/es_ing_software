public class Main {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 5;
        Operazione op = new Add();
        int ris = op.risultato(val1, val2);
        Stampa.Print(ris);
        op = new Sub();
        ris = op.risultato(val1, val2);
        Stampa.Print(ris);
        op = new Div();
        float ris_div = op.risultato(val1, val2);
        Stampa.Print(ris_div);
        op = new Mul();
        ris = op.risultato(val1, val2);
        Stampa.Print(ris);
    }
}