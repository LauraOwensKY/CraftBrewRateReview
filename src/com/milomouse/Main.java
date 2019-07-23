package com.milomouse;


import java.io.IOException;

/*
        DO OVER!!! For the purposes of passing the Code Louisville Java class, I'll be reading in
        data from two .txt files. One file contains data about craft breweries in Kentucky. The
        other contains a Kentucky Distributor dataset from the Bureau of Alcohol, Tobacco and
        Firearms.

        I'll compare the two datasets and print a report listing which distributors available
        locally to each brewery.
 */
/**************************************************************************************************
 *
 *   Craft Brew Rate & Review is a console-based tracking program for the craft brewery experience.
 *
 *   The user's brewery and beer type input are matched to the breweries and beer types
 *   listed in the corresponding CSV files (stored in the data folder of this package).
 *
 *   A unique tracking record is created for each user-entered brewery visit date.
 *   This tracking record includes background information on the brewery, the name of the beer
 *   being rated, and a 5-star-scale beer rating.
 *
 *   Records are printed to the console. Future versions will allow sorting & reporting based
 *   on the type, scale rating, and visit date for both the brewery and beer.
 *
 *  ***   Current functionality is limited to reviewing beer from specific KY craft breweries
 *  ***   that are recognized/members of the Brewers Association. Background information for these
 *  ***   breweries is contained in the BreweryBackgroundDataset.csv file in the data folder of
 *  ***   updates to allow a sorting-by-beer-type feature.
 *
 *************************************************************************************************
 */
public class Main {

    public static void main(String[] args) throws IOException {

                // Variable Declarations
        int menuChoice;
        String breweryChoice;
        String[] breweryBackgroundData;
        String breweryBackgroundDataset = "data/BreweryBackgroundDataset.txt";
        String kyDistributors = "data/KYDistributors.txt";

        do {
              // Display the main menu and choose what to do
            menuChoice = MenusInputOutputModule.mainMenuBeerGarden();
            System.out.println("You've chosen option " + menuChoice
                + "!"); // Verify input ==>> Add reentry option later
            System.out.println();

            // Run the selected module ==>> FOR NOW, ONLY WORKING ON OPTION 2 TO RATE BEER
            //TODO: Change if stmt to switch/case stmt ?????
            //TODO: ADD MENU CHOICE FOR DISTRIBUTOR MATCHER
            if (menuChoice == 0) {
                MenusInputOutputModule.GoGrabAColdOne();
            } else if (menuChoice == 1) {
                var distributorMatcher = new DistributorMatcher(kyDistributors, breweryBackgroundDataset);

                //TODO: Create Module ==> Visit the Brew House (Review a Brewery) -- Record/Rate a Brewery Visit on a user-supplied date
            } else if (menuChoice == 2) {
                //TODO: Create Module ==> Sample the Taps -- Record/Rate a Selected Beer Type from a Selected Brewery on a user-supplied date
                // SampleTheTaps();
            } else if (menuChoice == 3) {
                //TODO: Create Module ==> Relive the Magic (Run a Report)
            } else if (menuChoice == 4) {
                //TODO: Create Module ==> Tour the Office (Tracker Maintenance) -- Run reports, Maintain Craft Beer Tracker records, Save tracker as a spreadsheet
            }

        } while (menuChoice != 0);



    } // main
} // Main class
