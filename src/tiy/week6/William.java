package tiy.week6;

/**
 * Created by willi on 5/2/2016.
 */
public class William implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Wazzam, from William");
    }

    @Override
    public String getId() {
        return "william@theironyard.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}

