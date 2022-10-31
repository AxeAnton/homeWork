package hw21playFox.menuCommand;

import hw21playFox.MenuCommand;

public class CommandExit implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        System.exit(0);
    }
}
