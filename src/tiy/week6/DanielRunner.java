package tiy.week6;

/**
 * Created by danarchy on 5/2/16.
 */
public class DanielRunner extends RunnerBase{

    public DanielRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Daniel daniel = new Daniel();
        DanielRunner runner = new DanielRunner(daniel);
        runner.runProgrammer();
    }
}

