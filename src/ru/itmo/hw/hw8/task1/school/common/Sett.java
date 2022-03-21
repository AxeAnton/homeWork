package ru.itmo.hw.hw8.task1.school.common;

abstract public class Sett {

        // Свойства
        protected String name;
        protected int age;

        // Конструктор
        public Sett (String name, int age) {
            this.name = name;
            this.age = age;
        }

        //Геттеры
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        //Сеттеры
        public void setName(String name) {
            if (name == null || name.length() < 2)
                throw new IllegalArgumentException("Не верный ввод, ввидите имя длиной не менее двух букв");
            this.name = name;
        }
        public void setAge(int age) {
            if (age >= 7)
                throw new IllegalArgumentException("Возрост должен быть больше 7 лет и не равно нулю");
            this.age = age;
        }



}


