public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("modern", 4, 4, 2, 1);
        Lamp lamp = new Lamp("retro", false, 200);

        Bedroom bedroom = new Bedroom("Nicks", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}