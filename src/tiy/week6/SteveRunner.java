package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class SteveRunner extends RunnerBase {

    public SteveRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Steve steve = new Steve();
        SteveRunner runner = new SteveRunner(steve);
        runner.runProgrammer();
    }
}
