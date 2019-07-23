package com.milomouse;

public class DistributorMatcher {

    public DistributorMatcher(String distributorFile, String breweryFile) {
        var textFileReader = new TextFileReader();
        var distributorRecords = textFileReader.readFile(distributorFile); //First read is the heading line
        var breweryRecords = textFileReader.readFile(breweryFile);

        // Determine which distributors are available to each brewery
        System.out.println(breweryRecordsHeader);



    }
}
