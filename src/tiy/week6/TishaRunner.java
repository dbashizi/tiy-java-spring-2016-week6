package tiy.week6;

/**
 * Created by Tisha868 on 5/2/16.
 */
public class TishaRunner extends RunnerBase {

    public TishaRunner(Programmer programmer) {
        super(programmer); //calling the constructor of the RunnerBase class
    }

    public static void main(String[] args) {
        Tisha tisha = new Tisha();
        DominiqueRunner runner = new DominiqueRunner(tisha);
        runner.runProgrammer();
    }
}
