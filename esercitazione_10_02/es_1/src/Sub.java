public class Sub extends Stampa implements Operazione{

    @Override
    public int risultato(int val1, int val2) {
        return val1 - val2;
    }

    @Override
    public void stampaNome() {
        System.out.println("Sottrazione");
    }
}
