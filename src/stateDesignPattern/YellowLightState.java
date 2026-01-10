package stateDesignPattern;

public class YellowLightState implements LightState {
    @Override
    public void getColor() {
        System.out.println("Yellow");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow Down");
    }

    @Override
    public void stop() {
        System.out.println("Error");
    }

    @Override
    public void go() {
        System.out.println("Error");
    }

    @Override
    public LightColors nextColor() {
        return LightColors.RED;
    }
}
