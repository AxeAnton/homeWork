package ru.itmo.hw.hw6.task3;

public class Mouse {

   private int mouseSpeed;

    public Mouse(int mouseSpeed) {
        setMouseSpeed(mouseSpeed);
        }

    public int getMouseSpeed() {
        return mouseSpeed;
    }

    public void setMouseSpeed(int mouseSpeed) {
        if (mouseSpeed < 0)
            throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
        this.mouseSpeed = mouseSpeed;
    }





}
