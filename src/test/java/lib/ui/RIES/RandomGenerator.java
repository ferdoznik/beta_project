package lib.ui.RIES;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class RandomGenerator {
        private static final String CONSTANT_PART = "Ticket";

        public static String generateRandomTicketName() {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
            String timestamp = now.format(formatter);
            return CONSTANT_PART + "_" + timestamp;
        }
    }
