package tiy.week6;

/**
 * Created by kjpro on 5/2/2016.
 */
public class Kj implements Programmer {

    @Override
    public void sayHello() {
        System.out.println("This ya boy KJ...but, you already know!");
    }

    @Override
    public String getId() {
        return "kjproduction10@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }

}
