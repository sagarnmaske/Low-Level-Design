package stateDesignPattern;

public class GetCurState {

    public static LightState getState(LightColors colors) {
        switch (colors) {
            case RED -> {
                return new RedLightState();
            }
            case GREEN -> {
                return new GreenLightState();
            }
            case YELLOW -> {
                return new YellowLightState();
            }
            default -> {
                return null;
            }
        }
    }
}
