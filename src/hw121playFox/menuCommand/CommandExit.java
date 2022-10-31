package hw121playFox.menuCommand;

import hw121playFox.MenuCommand;

public class CommandExit implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        System.exit(0);
    }
}
