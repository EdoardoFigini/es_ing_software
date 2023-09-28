public class Utente {
    private String nome;
    private String cognome;
    private String numTel;

    public Utente(String nome, String cognome, String numTel){
        this.nome = nome;
        this.cognome = cognome;
        this.numTel = numTel;
    }

    // Alt+ins per aggiungere i getter automaticamente
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumTel() {
        return numTel;
    }

    @Override
    public String toString() {
        return "Nome Utente:\t\t" + this.nome + "\nCognome Utente:\t\t" + this.cognome + "\nNumero di Telefono:\t" + this.numTel + '\n';
    }
}