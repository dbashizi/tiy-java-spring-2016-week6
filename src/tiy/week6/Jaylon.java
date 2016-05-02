package tiy.week6;

/**
 * Created by Jaylon Breckenridge on 5/2/2016.
 */
public class Jaylon implements Programmer{
    @Override
    public void sayHello() {
        System.out.println("Hello, from Jaylon!");
    }

    @Override
    public String getId() {
        return "jaylon1996@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
