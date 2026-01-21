package commandDesignPattern;

public class TurnOnTvCommand implements Command {
    private final Tv tv;

    public TurnOnTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.isOn = true;
    }
}
