package tiy.week6;

/**
 * Created by Sonjtrez on 5/2/2016.
 */
public class Sonjtrez implements Programmer {
    @Override
    public void sayHello(){
        System.out.print("Sonjtrez, says Hello! ");
    }

    @Override
    public String getId() {
        return " sonjtreztigner@yahoo.com ";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}
