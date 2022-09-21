public class Main {
    public static void main(String[] args) {

        Thread helloWorldThread = new Thread(new HelloWorldTask());
        helloWorldThread.start();
        Thread goodbyeThread = new Thread(new  GoodbyeTask());
        goodbyeThread.start();

        /*
        try { //Se pone para que no se propague la excepcion
            Thread.sleep(1000);
        } catch (InterruptedException e ) {
            System.out.printf("Ha habido un error durante la espera");
        }
        System.out.printf("Goodbye");
    } */
    }
}