public class HelloWorldTask  implements Runnable {

    private int times;

    @Override
    public void run() { //En este metodo vamos a definir varias secuencias de instrucciones que se van a ejecutar (multihilo)
        System.out.println("Comenzando Hilo HelloWorld");
        for ( int contador = 0; contador < 50; contador++)
        try {
                Thread.sleep(10);
            } catch( InterruptedException e) {
            throw new RuntimeException(e);

        }

    }
}
