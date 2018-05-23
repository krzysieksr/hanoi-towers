package elements;

import java.util.Collection;
import java.util.Stack;

public class Stick {
    private final String stickSign;
    private final Stack<Ring> rings = new Stack<>();

    public Stick(String stickSign) {
        this.stickSign = stickSign;
    }

    public void pushRing(final Ring ring) {
        rings.add(ring);
    }

    public Ring popRing() {
        return rings.pop();
    }

    public void pushAllRings(Collection<Ring> ringsCollection) {
        rings.addAll(ringsCollection);
    }

    @Override
    public String toString() {
        return "kij " + stickSign;
    }
}
