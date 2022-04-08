public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public void drawPixel(int x, int y,String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);

    }
    public Monitor(String model,String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        String monitor = "Model - "+getModel() +", Manufacturer - "+
                getManufacturer()+ ", Resoultion height - "+getResolution().getHeight()+
                ", Resolution width - "+getResolution().getWidth();

        return monitor;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
