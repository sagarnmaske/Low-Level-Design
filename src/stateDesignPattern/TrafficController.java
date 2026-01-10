package stateDesignPattern;

public class TrafficController {
    LightState lightState;

    public TrafficController(LightColors color) {
        lightState = GetCurState.getState(color);
    }

    public void runsTrafficController() {
        int count = 0;
        while (count < 3) {
            System.out.print("Traffic Light :");lightState.getColor();
            lightState.go();
            lightState.stop();
            lightState.slowDown();
            lightState = GetCurState.getState(lightState.nextColor());
            count++;
        }
    }
}
