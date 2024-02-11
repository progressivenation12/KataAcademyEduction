package org.javaCore.module3;

import java.io.IOException;

public class Task_3_1_05 {
    public static void main(String[] args) throws MyNewException {
        testExp();
    }

    public static void testExp() throws MyNewException {
        throw new MyNewException("Exception");
    }
}

class MyNewException extends IOException {
    public MyNewException(String message) {
        super(message);
    }

    public MyNewException(String message, Throwable cause) {
        super(message, cause);
    }
}
