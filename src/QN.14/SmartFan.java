public class SmartFan implements Appliance {

    String brand;
    int    speedLevel;
    boolean isOn;

    SmartFan(String brand, int speedLevel) {
        this.brand      = brand;
        this.speedLevel = speedLevel;
        this.isOn       = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartFan  [" + brand + "] turned ON  at speed level " + speedLevel);
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartFan  [" + brand + "] turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("SmartFan  [" + brand + "] Status : " + (isOn ? "RUNNING" : "IDLE") + " | Speed : " + speedLevel);
    }
}