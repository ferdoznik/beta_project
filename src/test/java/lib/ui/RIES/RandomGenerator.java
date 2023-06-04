package lib.ui.RIES;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class RandomGenerator {
    private static final String CONSTANT_PART = "Tickets title";

    private RandomGenerator() {
        // Private constructor to prevent instantiation
    }

    public static String generateRandomTicketName() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH:mm:ss");
        String timestamp = now.format(formatter);
        return CONSTANT_PART + "_" + timestamp;
    }
}
