package tiy.week6;

/**
 * Created by Donta White on 5/2/2016.
 */
public class DontaRunner extends RunnerBase {
    public DontaRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
       DontaWhite donta = new DontaWhite();
        DominiqueRunner runner = new DominiqueRunner(donta);
        runner.runProgrammer();
    }


}
