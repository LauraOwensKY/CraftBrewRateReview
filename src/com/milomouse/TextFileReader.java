package com.milomouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

    /**  ==>> CODE FROM http://alvinalexander.com/blog/post/java/how-open-read-file-java-string-array-list
     * Open and read a file, and return the lines in the file as a list of Strings.
     * (Demonstrates Java FileReader, BufferedReader, and Java5.)
     */

        // Accepts a filename, returns an array
        public List<String> readFile(String filename){
            List<String> records = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    records.add(line);
                }
                reader.close();
                return records;
            }
            catch (Exception e) {
                System.err.format("Exception occurred trying to read '%s'.", filename);
                e.printStackTrace();
                return null;
            }
        }



} // class TextFileReader
