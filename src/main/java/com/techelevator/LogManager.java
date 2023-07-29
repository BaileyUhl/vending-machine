package com.techelevator;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogManager {
    public LogManager() throws FileNotFoundException {
    }
        public void logger()
        {
            Logger logger = Logger.getLogger("MyLog");
            FileHandler fh;

            try {

                // This block configure the logger with handler and formatter
                fh = new FileHandler("Log.txt");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);

                // the following statement is used to log any messages
                logger.info("My first log");

            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            logger.info("Hi How r u?");

        }
    }





