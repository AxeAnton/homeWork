package hwFrom10.hw21playFox.menuCommand;


import hwFrom10.hw21playFox.Execute;
import hwFrom10.hw21playFox.MenuCommand;

public class CommandStartGame implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        new Execute("Старт").start();
    }
}