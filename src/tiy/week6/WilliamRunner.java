package tiy.week6;

/**
 * Created by willi on 5/2/2016.
 */
public class WilliamRunner extends RunnerBase {

    public WilliamRunner(Programmer programmer) {
        super(programmer); // calling the base constructor
    }

    public static void main(String[] args) {
        William william = new William();
        WilliamRunner runner = new WilliamRunner(william);
        runner.runProgrammer();
    }
}
