package training;

public class StackWalkerDemo {

    public void m1() {
        m2();
    }

    public void m2() {
        m3();
    }

    public void m3() {
        StackWalker.getInstance().walk(frames -> {
            frames.forEach(frame -> System.out.println(frame.getClassName() + " " + frame.getMethodName() + " " + frame.getLineNumber()));
            return null;
        });
    }

    public static void main(String[] args) {
        new StackWalkerDemo().m1();
    }
}
