package org.javaCore.module4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_4_4_08 {
    public static void main(String[] args) {
        logging();
    }

public static void logging() {
    // com.javamentor.logging.Test
    // org.javaCore.module4.Task_4_4_08
    Logger logger = Logger.getLogger("org.javaCore.module4.Task_4_4_08");
    logger.log(Level.INFO, "Все хорошо");
    logger.log(Level.WARNING, "Произошла ошибка");
}
}
