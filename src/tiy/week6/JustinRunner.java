package tiy.week6;

/**
 * Created by Justins PC on 5/2/2016.
 */

public class JustinRunner extends RunnerBase {

    public JustinRunner (Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Justin justin = new Justin();
         JustinRunner runner = new JustinRunner(justin );
         runner.runProgrammer();
    }
}