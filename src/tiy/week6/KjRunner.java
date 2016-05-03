package tiy.week6;

/**
 * Created by kjpro on 5/2/2016.
 */
public class KjRunner extends RunnerBase {
    public KjRunner(Programmer programmer) {
        super(programmer);
    }
    public static void main(String[] args) {
        Kj kj = new Kj();
        KjRunner runner = new KjRunner(kj);
        runner.runProgrammer();
    }

}
