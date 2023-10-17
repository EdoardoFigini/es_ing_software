public class NoElementException extends RuntimeException {

    public NoElementException(){
        super("Elemento inesistente");
    }

    public NoElementException(String msg){
        super(msg);
    }
}
