package tiy.week6;

/**
 * Created by Jaylon Breckenridge on 5/2/2016.
 */
public class JaylonRunner extends RunnerBase {
    public JaylonRunner(Programmer programmer) {
        super(programmer);
    }

    public static void main(String[] args) {
        Jaylon jaylon = new Jaylon();
        JaylonRunner runner = new JaylonRunner(jaylon);
        runner.runProgrammer();
    }

}
