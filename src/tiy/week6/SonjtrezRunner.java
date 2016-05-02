package tiy.week6;

/**
 * Created by Sonjtrez on 5/2/2016.
 */
public class SonjtrezRunner extends RunnerBase {

    public SonjtrezRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Sonjtrez sonjtrez = new Sonjtrez();
        SonjtrezRunner runner = new SonjtrezRunner(sonjtrez);
        runner.runProgrammer();
    }
}
