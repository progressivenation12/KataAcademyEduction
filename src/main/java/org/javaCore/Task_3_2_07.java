package org.javaCore;

public class Task_3_2_07 {
public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    for (int i = 0; i < 3; i++) {
        try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
            robotConnection.moveRobotTo(toX, toY);
            i = 3;
        } catch (RobotConnectionException exception) {
            if (i == 2) {
                throw new RobotConnectionException(exception.getMessage());
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

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
