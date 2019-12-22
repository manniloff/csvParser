## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
TThis project is a simple parsing of .csv file and inserting right data  in database , wrong data to bad-data.csv file.

## Technologies
Project is created with:
* Java version: 1.8
* Springframework version: 2.1.3
* Opencsv version: 4.1
* SLF4J version: 1.6.1
* Lombok version: 1.18.10
* MySql


## Setup
To run this project, followed the guide:

```
* Go to the current link - https://github.com/manniloff/csvParser.git
* Create new project in your IDE ( File -> New -> Project from Version Control -> Git) and put a link
* In your MySql Server create new db with name "csvparser" or in application.properties change name of db
* In application.properties change login & password for connecting to db
* Start application (Application starting from Application.class)
* After starting go to the your browser and access link - http://127.0.0.1:8080/
* Choose .csv file and click submit
* Check you db , in table csv you can get validated data from file
* In project folder you can find "logs" folder with 3 files ( statistic.log - info about data from file,
                                                           bad-data.csv - info about wrong data from file,
                                                           csvparser.log - info about all moves in application
                                                          )
```