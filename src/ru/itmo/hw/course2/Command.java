package ru.itmo.hw.course2;

public interface Command {
    void executive();

    // метод для создания объектов команды
    static Command getInstance(String comandText) {
        if (comandText.equalsIgnoreCase("1")) {
            return () -> {

            };
        }

        return null;
    }

}
