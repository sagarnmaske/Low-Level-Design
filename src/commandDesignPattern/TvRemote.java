package commandDesignPattern;

import java.util.Stack;

public class TvRemote {
    public void controlTv() {
        Tv tv = new Tv();
        Stack<Command> undo = new Stack<>();
        Stack<Command> redo = new Stack<>();
        Command turnOnCommand = new TurnOnTvCommand(tv);
        Command turnOffCommand = new TurnOffTvCommand(tv);
        System.out.println("Is TV On:" + tv.isOn);
        turnOnCommand.execute();
        undo.push(turnOnCommand);
        System.out.println("Is Tv On:" + tv.isOn);
        System.out.println("Undo Operation");
        Command u = undo.pop();
        u.undo();
        redo.push(u);
        System.out.println("Is Tv On:" + tv.isOn);
        System.out.println("Redo Operation");
        Command r = redo.pop();
        r.execute();
        System.out.println("Is Tv On:" + tv.isOn);

        //  System.out.println("Is TV On:" + tv.isOn);
        //  turnOffCommand.execute();
        // System.out.println("Is TV On:" + tv.isOn);
    }
}
