package tiy.week6;

/**
 * Created by kat on 5/2/2016.
 */
public class Katiana implements Programmer{

        @Override
        public void sayHello() {
            System.out.println("Hello, from Katiana");
        }

        @Override
        public String getId() {
            return "kcjstephens@gmail.com";
        }

        @Override
        public boolean isJavaProgrammer() {
            return true;
        }
    }

