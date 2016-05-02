package tiy.week6;

/**
 * Created by Godfather on 5/2/2016.
 */
public class GodfatherRunner extends RunnerBase {

    public GodfatherRunner(Programmer programmer) { // constructor
        super(programmer);
    }

    public static void main(String[] args) {
        Godfather godfather = new Godfather();
        GodfatherRunner runner = new GodfatherRunner(godfather);
        runner.runProgrammer();
    }
}
