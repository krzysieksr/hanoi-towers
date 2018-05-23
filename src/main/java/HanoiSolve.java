import elements.Ring;
import elements.Stick;

import java.util.List;

public class HanoiSolve {

    private int counter = 0;

    void solve(List<Stick> stick, int numberOfRings) {

        Stick first = stick.get(0);
        Stick second = stick.get(1);
        Stick last = stick.get(2);

        recursiveSolve(numberOfRings, first, second, last);
        printResults();
    }

    private void recursiveSolve(int numberOfRings, Stick first, Stick second, Stick last) {
        counter += 1;

        if (numberOfRings == 1) {
            Ring ring = swapRingBetweenSticks(first, last);
            printSwapping(ring, first, last);
        } else {
            recursiveSolve(numberOfRings - 1, first, last, second);
            Ring ring = swapRingBetweenSticks(first, last);
            printSwapping(ring, first, last);
            recursiveSolve(numberOfRings - 1, second, first, last);
        }
    }

    private Ring swapRingBetweenSticks(Stick first, Stick second) {
        Ring ring = first.popRing();
        second.pushRing(ring);
        return ring;
    }

    private void printSwapping(Ring ring, Stick first, Stick last) {
        System.out.println(ring.toString() + first.toString() + " -> " + last.toString());
    }

    private void printResults() {
        System.out.println("Ilość ruchów: " + counter);
    }
}
