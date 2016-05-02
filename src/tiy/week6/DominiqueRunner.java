package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class DominiqueRunner extends RunnerBase {

    public DominiqueRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Dominique dominique = new Dominique();
        DominiqueRunner runner = new DominiqueRunner(dominique);
        runner.runProgrammer();
    }
}
