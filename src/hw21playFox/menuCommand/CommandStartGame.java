package hw21playFox.menuCommand;


import hw21playFox.Execute;
import hw21playFox.MenuCommand;

public class CommandStartGame implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        new Execute("Старт").start();
    }
}