public class Main {
    public static void main(String[] args) {
        Agenda a = new Agenda(2);
        boolean check;
        check = a.inserisci("Giovanni", "Ferola", "12345");
        if(!check) {
            System.out.println("Error");
        }
        check = a.inserisci("Alberto", "Finardi", "12345");
        if(!check) {
            System.out.println("Error");
        }
        check = a.inserisci("Achille", "Fiorentini", "12345");
        if(!check) {
            System.out.println("Error");
        }
        a.listaUtenti();
    }
}