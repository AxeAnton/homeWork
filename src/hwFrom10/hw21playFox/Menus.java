package hwFrom10.hw21playFox;

import hwFrom10.hw21playFox.menuCommand.CommandDownloadGame;
import hwFrom10.hw21playFox.menuCommand.CommandExit;
import hwFrom10.hw21playFox.menuCommand.CommandStartGame;


import java.util.Scanner;

public class Menus {

    CommandDownloadGame commandDownloadGame = new CommandDownloadGame();
    //Execute execute = new Execute().getUnNamePoint();
    //public Menus() {} //������ �����������

    void runMenu1() {
        boolean y = true;
        while (y) {
            Scanner in = new Scanner(System.in);
            System.out.println("������� �������:\n������ ���� - ������� 1;\n��������� ���� - ������� 2;\n����� - ������� 3. ");
            int userNum = in.nextInt();
            if (userNum == 1) {
                new CommandStartGame().ExecuteMenu();
                // execute.start();
            } else if (userNum == 2) {
                commandDownloadGame.readFromFile();
                // System.out.println(commandDownloadGame);
            } else if (userNum == 3) {
                runMenu2();
            } else {
                System.out.println("������� �� ������ ��������, ���������� �����");
            }
        }
    }

    public void runMenu2() {
        boolean y = true;
        while (y) {
            Scanner in = new Scanner(System.in);
            System.out.println("������� �������:\n��������� ���� - ������� 1;\n����� ��� ���������� - ������� 2");
            int userNum = in.nextInt();
            if (userNum == 1) {
                commandDownloadGame.writeToFile(new Execute().getUnNameKey()); // FIXME ������� ��������� ��� � ���� ���������.
                runMenu1(); // new CommandExit().ExecuteMenu();
            } else if (userNum == 2) {
                new CommandExit().ExecuteMenu();
            } else {
                System.out.println("������� �� ������ ��������, ���������� �����");
            }
        }
    }


}

