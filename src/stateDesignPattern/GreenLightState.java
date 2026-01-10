package stateDesignPattern;

public class GreenLightState implements LightState {


    @Override
    public void getColor() {
        System.out.println("Green");
    }

    @Override
    public void slowDown() {
        System.out.println("Error");
    }

    @Override
    public void stop() {
        System.out.println("Error");
    }

    @Override
    public void go() {
        System.out.println("Go Go Go");
    }

    @Override
    public LightColors nextColor() {
        return LightColors.YELLOW;
    }
}
