import java.util.Scanner;
import java.util.function.Supplier;

public class HanoiApp {

    public static void main(String[] args) {
        Supplier<String> userInputProvider = new Scanner(System.in)::nextLine;
        System.out.print("Podaj ilość dysków: ");
        int numberOfDisks = Integer.parseInt(userInputProvider.get());
        HanoiBuilder hanoiBuilder = HanoiBuilder.buildHanois(numberOfDisks);
        HanoiSolve solver = new HanoiSolve();
        solver.solve(hanoiBuilder.getSticksList(), hanoiBuilder.getRingsList().size());
    }
}
