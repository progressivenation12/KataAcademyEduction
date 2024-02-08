package org.javaCore;

public class Task_2_1_08 {
    public static void main(String[] args) {
        Robot robot = new Robot(5, -6, Direction.RIGHT);

        moveRobot(robot, 3, 6);
    }

    // Метод должен быть public (изменен на private, т.к. в Task_3_2_06 нужен тоже класс Robot)
    private static class Robot {
        private int x;
        private int y;
        Direction direction;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void turnLeft() {
            switch (getDirection()) {
                case UP -> direction = Direction.LEFT;
                case DOWN -> direction = Direction.RIGHT;
                case LEFT -> direction = Direction.DOWN;
                case RIGHT -> direction = Direction.UP;
            }
            System.out.printf("Robot turn %s.\n", getDirection());
        }

        public void turnRight() {
            switch (getDirection()) {
                case UP -> direction = Direction.RIGHT;
                case DOWN -> direction = Direction.LEFT;
                case LEFT -> direction = Direction.UP;
                case RIGHT -> direction = Direction.DOWN;
            }
            System.out.printf("Robot turn %s.\n", getDirection());
        }

        public void stepForward() {
            switch (getDirection()) {
                case UP -> y++;
                case DOWN -> y--;
                case LEFT -> x--;
                case RIGHT -> x++;
            }

//            System.out.printf("The robot took %d step.\n", i);
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int currentGetX = robot.getX();
        int currentGetY = robot.getY();

        if (currentGetX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currentGetX != toX) {
                robot.stepForward();
                currentGetX--;
            }
        } else if (currentGetX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentGetX != toX) {
                robot.stepForward();
                currentGetX++;
            }
        }

        if (currentGetY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (currentGetY != toY) {
                robot.stepForward();
                currentGetY--;
            }
        } else if (currentGetY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (currentGetY != toY) {
                robot.stepForward();
                currentGetY++;
            }
        }
    }
}
