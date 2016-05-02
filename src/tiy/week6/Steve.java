package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class Steve implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Steve");
    }

    @Override
    public String getId() {
        return "steve@google.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
