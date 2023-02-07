public class Box {


    private int countBox;
    private Enum rail;
    public Box(int countBox, Enum rail) {
        this.countBox = countBox;
        this.rail = rail;
    }

    public Enum getRail() {
        return rail;
    }

    public int getCountBox() {
        return countBox;
    }
}
