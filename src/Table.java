import java.util.Random;

public class Table extends Furniture{
        private int size;
        private int distance = generateDistance();
        private int time = getTime();

        public Table(String name, int size) {
                super(name);
                this.size = size;
        }

        public int getSize() {
                return size;
        }

        public int getDistance() {
                return distance;
        }

        @Override
        public String createFurniture() {
                return super.createFurniture() + "\nSize: " + this.size;
        }

        public int getTime() {
                return time;
        }

        public final String createFurniture(int time) {
                return super.createFurniture() + "\nSize: " + this.size + "\nсобрать через " + time + " минут";
        }

        private int generateDistance(){
                Random random = new Random();
                return random.nextInt(10) + 1;
        }

        public void moveDistance(){
                System.out.println(getName() + " передвинуть");
        }
        public void moveDistance(boolean confirmation) {
                if (confirmation == true) {
                        int aaa = this.distance;
                        System.out.println(getName() + " передвинуть на " + aaa + " метра/ов");
                } else {
                        System.out.println(this.getName() + " перемещение не требуется");
                }
        }

}
