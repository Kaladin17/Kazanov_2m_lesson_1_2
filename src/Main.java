public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4, Rail.METABOX);
        Desk workDesk = new Desk("work desk", 1000, "lumber", box1);
        System.out.println(workDesk.createFurniture());
        workDesk.moveDistance();

        Desk officeDesk = new Desk("office desk", 1200, "MDF");
        System.out.println(officeDesk.createFurniture());
        officeDesk.moveDistance(true);

        Table diningTable = new Table("dining table", 1800);
        System.out.println(diningTable.createFurniture(10));

    }
}