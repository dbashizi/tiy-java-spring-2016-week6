package tiy.week6;

/**
 * Created by Justins PC on 5/2/2016.
 */
public class Justin implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Justin!");
    }

    @Override
    public String getId() {
        return "evanthomashicks@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}