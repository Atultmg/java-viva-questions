import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MedicalLogger {

    static String timestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    static void createNewLog(String filename) {
        try {
            FileWriter writer = new FileWriter(filename, false);
            writer.write("=== MEDICAL RECORDS SYSTEM LOG ===\n");
            writer.write("Created    : " + timestamp() + "\n");
            writer.write("Status     : Fresh log file generated\n");
            writer.write("----------------------------\n");
            writer.close();
            System.out.println("New log file created : " + filename);
        } catch (IOException e) {
            System.out.println("ERROR creating file  : " + e.getMessage());
        }
    }

    static void appendToLog(String filename, String message) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write("[" + timestamp() + "] " + message + "\n");
            writer.close();
            System.out.println("Entry appended       : " + message);
        } catch (IOException e) {
            System.out.println("ERROR appending log  : " + e.getMessage());
        }
    }

    static void overwriteLog(String filename, String message) {
        try {
            FileWriter writer = new FileWriter(filename, false);
            writer.write("=== OVERWRITTEN LOG ===\n");
            writer.write("[" + timestamp() + "] " + message + "\n");
            writer.write("----------------------------\n");
            writer.close();
            System.out.println("Log overwritten      : " + message);
        } catch (IOException e) {
            System.out.println("ERROR overwriting    : " + e.getMessage());
        }
    }

    static void checkAndProcess(String filename) {
        File logFile = new File(filename);

        if (!logFile.exists()) {
            System.out.println("File not found       : Generating fresh log...");
            createNewLog(filename);
        } else {
            System.out.println("File found           : Appending new entries...");
        }

        appendToLog(filename, "Dr. Atul        - Morning shift started");
        appendToLog(filename, "Dr. Rhijesh     - Patient records accessed");
        appendToLog(filename, "Dr. Subina      - Lab results uploaded");
        appendToLog(filename, "System          - Backup completed");
    }

    public static void main(String[] args) {

        String filename = "daily_log.txt";

        System.out.println("=== STARTUP SEQUENCE ===");
        checkAndProcess(filename);

        System.out.println("----------------------------");
        System.out.println("=== OVERWRITE SEQUENCE ===");
        overwriteLog(filename, "System rebooted - New session started");

        System.out.println("----------------------------");
        System.out.println("=== APPEND SEQUENCE ===");
        appendToLog(filename, "Dr. Krish       - Evening shift started");
        appendToLog(filename, "System          - Daily log closed");

        System.out.println("----------------------------");
        System.out.println("All log operations completed successfully.");
    }
}