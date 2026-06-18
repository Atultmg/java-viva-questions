public class SmartLight implements Appliance {

    String brand;
    int    brightness;
    String colorMode;
    boolean isOn;

    SmartLight(String brand, int brightness, String colorMode) {
        this.brand      = brand;
        this.brightness = brightness;
        this.colorMode  = colorMode;
        this.isOn       = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartLight[" + brand + "] turned ON  | Brightness: " + brightness + "% | Mode: " + colorMode);
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartLight[" + brand + "] turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("SmartLight[" + brand + "] Status : " + (isOn ? "ACTIVE" : "IDLE") + " | Brightness: " + brightness + "% | Mode: " + colorMode);
    }
}