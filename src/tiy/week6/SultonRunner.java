package tiy.week6;

/**
 * Created by Sulton on 5/2/2016.
 */
public class SultonRunner extends RunnerBase {
    public SultonRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Sulton sulton = new Sulton();
        SultonRunner runner = new SultonRunner(sulton);
        runner.runProgrammer();
    }
}
