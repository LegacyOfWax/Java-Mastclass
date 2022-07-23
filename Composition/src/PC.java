public class PC {
    //can not use private Case case; as case is a reserved keyword
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo()
    {
        //fancy graphic code
        //getMonitor().drawPixelAt(1200, 50, "red");
        //Also using
        monitor.drawPixelAt(1200, 50, "red");
        //gets the same access as getMonitor as you draw from the source
    }
//    Getters not needed in this form as you can use just monitor.FUNCTION() instead of getMonitor().FUNCTION()
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
