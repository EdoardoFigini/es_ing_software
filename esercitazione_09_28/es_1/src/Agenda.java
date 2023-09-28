public class Agenda {
    private Utente[] utenti;
    private int dim;
    private int index;

    public  Agenda(int dim) {
        this.utenti = new Utente[dim];
        this.dim = dim;
        this.index = 0;
    }

    public boolean isFull() {
        return index >= dim;
    }
    public boolean inserisci(String n, String c, String t) {
        if(!isFull()) {
            Utente u = new Utente(n, c, t);
            this.utenti[index] = u;
            this.index++;
            return true;
        }
        return false;
    }

    public String trova(String n, String c) {
        for (Utente u : this.utenti) {
            if(u.getNome().equals(n) && u.getCognome().equals(c)) return u.getNumTel();
        }
        return null;
    }

    public void listaUtenti() {
        for (Utente u : this.utenti) {
            System.out.println(u.toString());
        }
    }
}