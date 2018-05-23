import elements.Ring;
import elements.Stick;

import java.util.LinkedList;
import java.util.List;

public class HanoiBuilder {
    private final static int STICKS_NUMBER = 3;

    private final List<Stick> sticksList = new LinkedList<>();
    private final List<Ring> ringsList = new LinkedList<>();


    public static HanoiBuilder buildHanois(int numberOfRings) {
        HanoiBuilder hanoiBuilder = new HanoiBuilder();
        hanoiBuilder.buildSticks(STICKS_NUMBER);
        hanoiBuilder.buildRings(numberOfRings);
        return hanoiBuilder;
    }

    private void buildRings(int numberOfRings) {

        for (int i = 0; i < numberOfRings; i++) {
            ringsList.add(new Ring(i + 1));
        }

        sticksList.get(0).pushAllRings(ringsList);
    }

    public List<Stick> getSticksList() {
        return sticksList;
    }

    public List<Ring> getRingsList() {
        return ringsList;
    }

    private void buildSticks(final int numberOfSticks) {
        for (int i = 0; i < numberOfSticks; i++) {
            sticksList.add(new Stick(String.valueOf(Character.toChars(i + 65))));
        }

    }

}
