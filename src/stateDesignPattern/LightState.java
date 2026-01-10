package stateDesignPattern;

public interface LightState {
    void getColor();
    void slowDown();
    void stop();
    void go();
    LightColors nextColor();
}
