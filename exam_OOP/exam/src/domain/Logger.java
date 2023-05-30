package domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private boolean createFile() {
        try {
            File logger = new File("logs.txt");
            if (logger.createNewFile()) {
                return true;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating file");
            return false;
        }
    }

    public void log(String logs) {
        if (createFile()) {
            try {
                BufferedWriter wr = new BufferedWriter(new FileWriter("logs.txt", true));
                wr.append(logs);
                wr.close();
            } catch (Exception e) {
                System.out.println("An error occurred while creating logs");
            }
        }
    }

}