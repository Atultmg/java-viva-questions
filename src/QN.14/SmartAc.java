public class SmartAc implements Appliance {

    String brand;
    int    temperature;
    boolean isOn;

    SmartAc(String brand, int temperature) {
        this.brand       = brand;
        this.temperature = temperature;
        this.isOn        = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartAC   [" + brand + "] turned ON  at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartAC   [" + brand + "] turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("SmartAC   [" + brand + "] Status : " + (isOn ? "COOLING" : "IDLE") + " | Temp: " + temperature + "°C");
    }
}