public class Main {
    public static void main(String[] args) {
        OnTaskErrorListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

    }
}
