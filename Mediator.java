class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.mediator.start();
        isOn = true;
        System.out.println("Fan is on");
    }

    public void turnOff() {
        isOn = false;
        this.mediator.stop();
        System.out.println("Fan is off");
    }
}


public class Button {
     private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        this.mediator.press();
    }
    
}

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}

class PowerSupplier {
    public void turnOn() {
        
    }

    public void turnOff() {
 
    }
}

public class FanDemo {

    private static Button button;
    private static Fan fan;
    
    public static void setUp() {
        button = new Button();
        fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
    }
    
    public static void main(String[] args) {
        setUp();
        button.press();
        button.press();
    }
    
}


