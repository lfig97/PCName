public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName){
        System.out.println(programName +" is now running");

    }

    public MotherBoard(String model,String manufacturer,String bios,int ramSlots,int cardSlots){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString(){
        String motherBoard = "Model - "+getModel() +", Manufacturer - "+
                getManufacturer()+ ", RamSlots - "+getRamSlots()
                +", CardSlots - "+getCardSlots()+", Bios - "+ getBios();

        return motherBoard;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
