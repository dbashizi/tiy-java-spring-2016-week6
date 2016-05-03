package tiy.week6;

/**
 * Created by kat on 5/2/2016.
 */
public class KatianaRunner extends RunnerBase {

        public KatianaRunner(Programmer programmer) {
            super(programmer);
        } //super calls custom constructor from RunnerBase

        public static void main(String[] args) {
            Katiana katiana = new Katiana();
            KatianaRunner runner = new KatianaRunner(katiana);
            runner.runProgrammer();
        }
    }

