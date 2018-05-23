package elements;

public class Ring {
    private final int ringSize;

    public Ring(int ringSize) {
        this.ringSize = ringSize;
    }


    @Override
    public String toString() {
        return "Dysk " + ringSize + ": ";
    }
}
