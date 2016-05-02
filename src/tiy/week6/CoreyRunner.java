package tiy.week6;

/**
 * Created by Corey Shaw on 5/2/2016.
 */
public class CoreyRunner extends RunnerBase {

    public CoreyRunner(Programmer programmer) {
            super(programmer);
        }

    public static void main(String[] args) {
    Corey Corey = new Corey();
CoreyRunner runner = new CoreyRunner(Corey);
        runner.runProgrammer();
    }
}

