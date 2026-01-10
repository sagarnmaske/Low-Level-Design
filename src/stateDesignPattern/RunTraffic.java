package stateDesignPattern;

public class RunTraffic {
    public void trafficController(){
        TrafficController trafficController = new TrafficController(LightColors.YELLOW);
        trafficController.runsTrafficController();
    }
}
