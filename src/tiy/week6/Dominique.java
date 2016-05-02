package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class Dominique implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Dominique");
    }

    @Override
    public String getId() {
        return "dominique@theironyard.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
