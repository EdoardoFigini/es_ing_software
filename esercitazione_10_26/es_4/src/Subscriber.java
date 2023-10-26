public class Subscriber extends Thread{
    ContoInBancaSync myC;
    static int subscribeCounter;
    private int myId;
    public Subscriber(ContoInBancaSync c){
        this.myC=c;
        myId = subscribeCounter++;
    }
    @Override
    public void run() {
        System.out.println("Started Subscriber counter thread " + myId);

        while(true) {
            myC.decrement();
            System.out.println("Ho appena SOTTRATTO, il valore del counter è " + Integer.toString(myC.getCount()));
            if(myC.getCount()<0)
                throw new RuntimeException("Valore troppo basso");
        }
    }
}

