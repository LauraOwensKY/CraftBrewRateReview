# CraftBrewRateReview

DESCRIPTION: Rate and review your favorite craft brews and breweries with this ingenious, console-based tracker! 

OVERVIEW: The Craft Brew Rate & Review program allows users to track brewery visits and rate beers. The tracker file is saved to the user's hard drive and uses the data from two files contained in this repository.

CURRENT PROCESS:
Welcome to the beer garden! -- The user selects from 5 main-menu options: 1. Visit the Brew House (Review a Brewery), 2. Sample the Taps (Rate a Beer), 3. Relive the Magic (Run a Report), 4. Tour the Office (Tracker Maintenance), and 0. Go Grab a Cold One (Exit). Initially, only option "2. Sample the Taps (Rate a Beer)" will be fully functional.

Selecting option "2. Sample the Taps (Rate a Beer)" gives the user a list of breweries and beer styles to choose from (reads from two separate data files), creates a new tracker record and populates it with brewery background data. The user then enters their visit date, the name of the beer being rated, and a star rating. The record is then displayed for the user's approval before being written to their personal tracker.

FUTURE PROCESS: Eventually, users will be able to track and rate breweries as well as sort their tracker file based on star ratings, beer style, brewery type, and date of visit. A maintenance module will provide a way to edit/update brewery and beer records.

FILES: 
1. BreweryBackgroundDataset.csv -- a database of Kentucky independent craft breweries certified by and obtained from the Brewers' Association website. ( https://www.brewersassociation.org/directories/breweries/?location=KY )

Data includes the brewery name, brewery type* (as classified by the Brewers Association), URL or Facebook link, physical address, phone number and the days the breweries are closed. The choice to include days closed, as opposed to days open, was made to save file space since many breweries are open 7 days a week. By listing the physical address and days closed, future code can be written to privide a "Beer Traveller" module with a map, route and visit schedule.

*According to the Brewers Association website, "There are six distinct craft beer industry market segments: microbreweries, brewpubs, taproom breweries, regional breweries, contract brewing companies, and alternating proprietors." 
( https://www.brewersassociation.org/statistics-and-data/craft-beer-industry-market-segments/ )

Another future proof aspect is the database itself. Although only KY craft breweries are included presently, additional states or countries can easily be added by expanding the existing file or creating separate databases to accommodate geographic areas.

2. BeerStyles.csv -- a list of 20 common beer styles chosen from the Table of Contents list of the Beer Styles Study Guide on CraftBeer.com ( https://www.craftbeer.com/beer/beer-styles-guide )

By no means a comprehensive list, these beer styles provide the most general styles and a few of my favorites. Users can provide additional details when entering the beer names into the tracker. For example, "Ale" is listed in the file. Users can include Amber Ale, Black Ale, Pale Ale, Golden Strong Ale, Scottish Style Ale, German Style Ale, etc. with the name of the beer. The categories  "Specialty Beer" and "Other" provide additional options for more detailed varieties or crazy innovations that just don't seem to fita general style. 
