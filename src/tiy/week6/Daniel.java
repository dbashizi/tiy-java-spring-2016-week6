package tiy.week6;

/**
 * Created by danarchy on 5/2/16.
 */
public class Daniel implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Dan!");
    }

    @Override
    public String getId() {
        return "dan.nicodemo@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
