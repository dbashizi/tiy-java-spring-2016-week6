package tiy.week6;

/**
 * Created by Donta White on 5/2/2016.
 */
public class DontaWhite implements Programmer {
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
