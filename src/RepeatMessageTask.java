public class RepeatMessageTask implements Runnable {
    private int times;
    private String mensaje;
    private int ttw;


    public  RepeatMessageTask (int times, String mensaje, int tiempo) {
        this.times = times;
        this.mensaje = mensaje;
        this.ttw = tiempo;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println("Goodbye");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }

        }
    }
}
