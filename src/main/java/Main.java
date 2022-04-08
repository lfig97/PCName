public class Main {
    public static void main(String[] args) {
        Case aCase = new Case("Inspiron","Dell","120v");
        MotherBoard motherBoard = new MotherBoard("Dell Motherboard","Dell",
                "bios",2,2);
        Monitor monitor = new Monitor("LG crystal","LG");
        Resolution resolution = new Resolution();
        resolution.setHeight(5);
        resolution.setWidth(5);
        monitor.setResolution(resolution);
        PC pc = new PC(aCase,motherBoard,monitor);

        pc.description();
        pc.powerUp();
    }



}
