package com.milomouse;

public class DistributorMatcher {

    public DistributorMatcher(String distributorFile, String breweryFile) {
        var textFileReader = new TextFileReader();
        var distributorRecordsHeader = textFileReader.readFile(distributorFile); //First read is the heading line
        var breweryRecordsHeader = textFileReader.readFile(breweryFile);

        // Determine which distributors are available to each brewery
        System.out.println(breweryRecordsHeader);



    }
}
