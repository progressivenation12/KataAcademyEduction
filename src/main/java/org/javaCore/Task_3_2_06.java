package org.javaCore;

public class Task_3_2_06 {
    public static void main(String[] args) {
        MyRobotConnectionManager myRobotConnectionManager = new MyRobotConnectionManager();
        moveRobot(myRobotConnectionManager, 5, -6);
    }

    // Класс создан для тестирования
    public static class MyRobotConnectionManager implements RobotConnectionManager {
        @Override
        public RobotConnection getConnection() {
            System.out.println("Creating new connection");

            return new Robot(0, 0, Direction.UP);
        }
    }

    public static class Robot implements RobotConnection {
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
        }

        @Override
        public void moveRobotTo(int x, int y) {
            int currentGetX = getX();
            int currentGetY = getY();

            if (currentGetX > x) {
                while (getDirection() != Direction.LEFT) {
                    turnLeft();
                }
                while (currentGetX != x) {
                    stepForward();
                    currentGetX--;
                }
            } else if (currentGetX < x) {
                while (getDirection() != Direction.RIGHT) {
                    turnRight();
                }
                while (currentGetX != x) {
                    stepForward();
                    currentGetX++;
                }
            }

            if (currentGetY > y) {
                while (getDirection() != Direction.DOWN) {
                    turnLeft();
                }
                while (currentGetY != y) {
                    stepForward();
                    currentGetY--;
                }
            } else if (currentGetY < y) {
                while (getDirection() != Direction.UP) {
                    turnRight();
                }
                while (currentGetY != y) {
                    stepForward();
                    currentGetY++;
                }
            }
        }

        @Override
        public void close() {

        }
    }

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection = null;
        boolean connectionEstablished = true;

        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException exception) {
                if (i == 2) {
                    if (robotConnection != null) {
                        robotConnection.close();
                    }
                    connectionEstablished = false;
                    throw new RobotConnectionException(exception.getMessage());
                }
            } catch (Exception exception) {
                try {
                    if (robotConnection != null) {
                        robotConnection.close();
                        connectionEstablished = false;
                    }
                } catch (Exception ignore) {

                }
                throw exception;
            } finally {
                try {
                    if (robotConnection != null && connectionEstablished) {
                        robotConnection.close();
                    }
                } catch (Exception ignore) {

                }
            }
        }
    }

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public static class RobotConnectionException extends RuntimeException {
        public RobotConnectionException(String message) {
            super(message);
        }
    }
}