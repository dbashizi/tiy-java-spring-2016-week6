package tiy.week6;

/**
 * Created by Godfather on 5/2/2016.
 */
public class Godfather implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from The Godfather");
    }

    @Override
    public String getId() {
        return "francis.aarons@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
