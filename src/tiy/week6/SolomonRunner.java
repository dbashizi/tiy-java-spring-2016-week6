package tiy.week6;

/**
 * Created by silve on 5/2/2016 at 2:17 PM with name: tiy-java-spring-2016-week6.
 */
public class SolomonRunner extends RunnerBase {
    public SolomonRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Solomon Solomon = new Solomon();
        SolomonRunner runner = new SolomonRunner(Solomon);
        runner.runProgrammer();
    }
}
    

