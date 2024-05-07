package org.example;

import java.util.logging.Logger;

public class Printer {

    Logger logger = Logger.getLogger(getClass().getName());

    public void showInfo(String message) {
        logger.info(message);
    }

    public void showWarning(String message) {
        logger.warning(message);
    }

    public void showError(String message) {
        logger.severe(message);
    }

    public void showFine(String message) {
        logger.fine(message);
    }
}
