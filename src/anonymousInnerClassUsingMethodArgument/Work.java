package anonymousInnerClassUsingMethodArgument;

public class Work {
    public static void main(String[] args) {
        Trainee work = new Trainee();
        work.managing(new Manager() {
            @Override
            public void manage() {
                System.out.println("Manager sir work done by passing you as argument in my method");
            }
        });
    }
}
