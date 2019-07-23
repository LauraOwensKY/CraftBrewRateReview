package com.milomouse;

public class DistributorMatcher {

    public DistributorMatcher(String distributorFile, String breweryFile) {
        var textFileReader = new TextFileReader();
        var distributorRecords = textFileReader.readFile(distributorFile);
        var breweryRecords = textFileReader.readFile(breweryFile);

        // Determine which distributors are available to each brewery


    }
}
