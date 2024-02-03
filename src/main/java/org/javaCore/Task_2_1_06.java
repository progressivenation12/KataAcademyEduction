package org.javaCore;

public class Task_2_1_06 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.sayHello();
        cat.sayHello();

        dog.catchCat(cat);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
