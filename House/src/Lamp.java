public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean batteries, int globRating) {
        this.style = style;
        this.battery = batteries;
        this.globRating = globRating;
    }
    public void turnOn()
    {
        System.out.println("Lamp -> Turn On");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
