public class PC {
    private Case aCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    private void drawLogo(){
        getMonitor().drawPixel(5,5,"blue");

    }

    public void powerUp(){
        getaCase().pressPowerButton();
        drawLogo();
        getMotherBoard().loadProgram("The Simulation");
    }

    public void description(){
        System.out.println( "Welcome to worst buy below is the description of the pc on sale today");
        System.out.println("Case: "+ aCase.toString());
        System.out.println( "Welcome to worst buy below is the description of the pc on sale today");
        System.out.println("Motherboard: "+motherBoard.toString());
        System.out.println( "Welcome to worst buy below is the description of the pc on sale today");
        System.out.println("Monitor: "+monitor.toString());
    }

    public PC(Case c, MotherBoard mb, Monitor m){
        this.aCase =c;
        this.motherBoard = mb;
        this.monitor = m;
    }

    public Case getaCase() {
        return aCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }


}
