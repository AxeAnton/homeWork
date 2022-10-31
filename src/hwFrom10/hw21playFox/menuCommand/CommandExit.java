package hwFrom10.hw21playFox.menuCommand;

import hwFrom10.hw21playFox.MenuCommand;

public class CommandExit implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        System.exit(0);
    }
}
