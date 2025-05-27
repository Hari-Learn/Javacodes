package anonymousInnerClassWithThreadSample;

public class ThreadSample {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Example of inner class as method argument");
            }
        }).start();
    }
}
