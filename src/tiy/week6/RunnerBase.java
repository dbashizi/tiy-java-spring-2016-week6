package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class RunnerBase {

    Programmer programmer;

    public RunnerBase() {
    }

    public RunnerBase(Programmer programmer) {
        this.programmer = programmer;
    }

    public void runProgrammer() {
        programmer.sayHello();
        if (programmer.isJavaProgrammer()) {
            System.out.println(programmer.getId() + " is a Java Programmer");
        } else {
            System.out.println(programmer.getId() + " is not a Java Programmer");
        }
    }
}
