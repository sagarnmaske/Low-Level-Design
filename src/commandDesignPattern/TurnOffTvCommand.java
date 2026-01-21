package commandDesignPattern;

public class TurnOffTvCommand implements Command {
    private final Tv tv;

    public TurnOffTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("Turning Off Tv");
        this.tv.isOn = false;
    }

    @Override
    public void undo() {
        System.out.println("Undo Operation :: Turning On Tv");
        this.tv.isOn = true;
    }
}
