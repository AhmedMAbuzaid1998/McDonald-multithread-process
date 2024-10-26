public class MultiThreadProccess extends Thread {
    private int threadNumber;

    public MultiThreadProccess(int i) {
        this.threadNumber=i;
    }

    public void run() {
        String[] arr = {"Mince the meat","Spicing","Grill","Toast the Buns","Sauces",
                "Assemble and serve"};
        for (int i = 0; i <= 5; i++) {
            System.out.println(arr[threadNumber]+" \"thread "+threadNumber+"\"");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

