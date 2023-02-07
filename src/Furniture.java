public class Furniture {

    private String name;
    public Furniture(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String createFurniture() {
        return "\nИзготовить: " + "\nName: " + this.name;
    }


}
