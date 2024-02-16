package org.javaCore.module3;

public class Task_3_2_05 {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception ignored) {

        }
    }

    public static class Car implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }

        public static void drive() {
            System.out.println("Машина поехала.");
        }
    }
}
