package tiy.week6;

/**
 * Created by Tisha868 on 5/2/16.
 */
public class Tisha implements Programmer {
    @Override
    public void sayHello() {
        System.out.println("Hello, from Tisha :) ");
    }

    @Override
    public String getId() {
        return "tisha_sutherland2001@aol.com";
    }

    @Override
    public boolean isJavaProgrammer() {
        return true;
    }
}