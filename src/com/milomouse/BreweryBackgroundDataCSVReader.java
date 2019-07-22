package com.milomouse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BreweryBackgroundDataCSVReader {   // Class to import from the BreweryBackgroundDataset file --> a simple CSV file using a comma separator
                                                // -- no special characters in dataset requiring escape
                                                // Adapted from mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

    public static void readCSVmain(String[] args) {     //TODO: Change "main" to "readCSVmain" ??? Remove STATIC???

//        String csvFile = "";                    //TODO: Enter path for CSV file BreweryBackgroundDataset here --> PASS IN AS AN ARG using Generics???
//
//        private BufferedReader br = null;               // Contains the buffer read
//        private String line = "";                       // Contains a line of data read from the CSV file
//        private String csvSplitBy = ",";                // Use comma separator in dataset and NO SPECIAL CHARACTERS that need escaping
//
//        private String[] breweryBackgroundData = "";    // Contains data for an brewery (or one line of data from the CSV dataset file)
//        private String breweryName = "";
//        private String breweryURL = "";
//        private String breweryAddress = "";
//        private String breweryPhoneNumber = "";
//        private String breweryDaysClosed = "";
//
//
//        try {                                                   // Read a line of background data and assign it to the current brewery
//            br = new BufferedReader((new FileReader(csvFile)));
//            if ((line = br.readLine()) != null) {
//                breweryName = breweryBackgroundData[0];
//                breweryURL = breweryBackgroundData[1];
//                breweryAddress = (breweryBackgroundData[2] + ", " + breweryBackgroundData[3] + ", " + breweryBackgroundData[4] + " " + breweryBackgroundData[5]);
//                breweryPhoneNumber = breweryBackgroundData[6];
//                breweryDaysClosed = breweryBackgroundData[7];
//
//                // DO SOMETHING HERE WITH THE INDIVIDUAL BREWERY DATA SEPARATED -- print it out below to test functionality, TODO: Remove print stmts below
//                //  System.out.printf("%s, %s %s %n", breweryName, breweryAddress, breweryPhoneNumber);
//                //  System.out.printf("URL: %s     Brewery CLOSED: %s%n", breweryURL, breweryDaysClosed);
//
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }  // try to read a line
    } // readCSVmain



} // BreweryBackgroundDataCSVReader class
