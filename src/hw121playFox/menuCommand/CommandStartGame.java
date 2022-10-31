package hw121playFox.menuCommand;


import hw121playFox.Execute;
import hw121playFox.MenuCommand;
import hw121playFox.Node;

import java.util.HashMap;
import java.util.Scanner;

public class CommandStartGame implements MenuCommand {

    @Override
    public void ExecuteMenu() {
        new Execute("Старт").start();
    }
}