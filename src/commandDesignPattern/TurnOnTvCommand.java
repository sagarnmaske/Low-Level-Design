package commandDesignPattern;

public class TurnOnTvCommand implements Command {
    private final Tv tv;

    public TurnOnTvCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("Turning On Tv");
        this.tv.isOn = true;
    }

    @Override
    public void undo() {
        System.out.println("Undo Operation :: Turning Off Tv");
        this.tv.isOn = false;
    }
}
