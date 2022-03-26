package com.hillel.classwork.lesson3;

public class BirdMain {

    public static void main(String[] args) {

        Bird bird = new Bird("red");
        System.out.println(bird);

        // вызываем не статический метод у объекта
        bird.speak();

        Bird bird1 = new Bird("yellow");
        System.out.println(bird1);
        bird1.speak();

        Bird bird3 = new Bird("black");
        System.out.println(bird3);
        bird3.speak();

        // вызываем статический  метод у класса
        System.out.println(Bird.getCount());

        // статическая переменная доступна через класс
        System.out.println(Bird.COUNT);

        String color = bird.getColor();
        System.out.println("color " + color);

        bird.setColor("white");
        System.out.println("color " + bird.getColor());

    }
}
