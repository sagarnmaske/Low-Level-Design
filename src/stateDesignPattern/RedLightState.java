package stateDesignPattern;

public class RedLightState implements LightState {
    @Override
    public void getColor() {
        System.out.println("Red");
    }

    @Override
    public void slowDown() {
        System.out.println("Error");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void go() {
        System.out.println("Error");
    }

    @Override
    public LightColors nextColor() {
        return LightColors.GREEN;
    }
}
