package tiy.week6;

/**
 * Created by Corey Shaw on 5/2/2016.
 */
public class Corey implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Whats up , from Corey");
    }

    @Override
    public String getId() {
        return "Corey Shaw @theironyard.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}

