package tiy.week6;

/**
 * Created by Sulton on 5/2/2016.
 */
public class Sulton implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Sulton");
    }

    @Override
    public String getId() {
        return "elhadi.sulton@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
