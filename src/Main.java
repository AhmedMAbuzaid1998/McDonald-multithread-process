public class Main {
    public static void main(String[] args) {

        MultiThreading M1=new MultiThreading();
        MultiThreading M2=new MultiThreading();
        M1.start();
        M2.start();

       /*
        for(int i=0;i<=5;i++) {
            MultiThreadProccess p=new MultiThreadProccess(i);
            p.start();

        }
        */
    }
}