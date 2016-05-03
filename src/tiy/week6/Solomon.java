package tiy.week6;

/**
 * Created by silve on 5/2/2016 at 2:13 PM with name: tiy-java-spring-2016-week6.
 */
public class Solomon implements Programmer {
    @Override
    public void sayHello()  {

        System.out.println("Hello, from Solomon");
    }



    @Override
    public String getId() {
        return "silverwatkins@gmail.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return false;
    }
}
