public final class Desk extends Table{
    private String fabric;
    private Box box;

    public Desk(String name, int size, String fabric, Box box) {
        super(name, size);
        this.box = box;
        this.fabric = fabric;
    }
    public Desk(String name, int size, String fabric) {
        super(name, size);
        this.fabric = fabric;
    }
    public String getFabric() {
        return fabric;
    }
    public Box getBox() {
        return box;
    }


    public String createFurniture() {
        if (box != null) {
            return super.createFurniture() + "\nFabric: " + this.fabric + "\nCount box: " + this.box.getCountBox() + "\nType rail: " + String.valueOf(this.box.getRail());
        } else {
            return super.createFurniture() + "\nFabric: " + this.fabric;
        }
    }
}
