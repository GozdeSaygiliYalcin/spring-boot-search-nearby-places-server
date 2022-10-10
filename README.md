# Search Nearby Places

Search Nearby Places using Google Places API.

## Description

This project is located in two separate repositories which are server and client.

Using this project you can search for places near specific latitude-longitude coordinates with a radius in meters.
When you entered to the form page a lattitude, longitude and radius, all places will be shown on the page as a gogle maps link.
And also this click will be triggered server and all results will be saved to the database. This parameters will be checked
from database and if it does not exist they will save to the table.
On the developer environment it tested using PostgreSql.
If you want to test h2 database it is also added to the dependencies.

## Getting Started

In order to select places used json data format.
https://maps.googleapis.com/maps/api/place/nearbysearch/json

This is a sample query.
https://maps.googleapis.com/maps/api/place/nearbysearch/json?location={lattiude},{longtitude}&radius={radius}&key={YOUR_API_KEY}

### Technologies & Dependencies

This project developed using Spring Boot, PostgreSql and React.
#### Server Part - Dependencies
* Gradle Template
* Docker
* Spring-boot-starter-actuator
* Spring-boot-starter-data-jpa
* Spring-boot-starter-web
* Spring-boot-devtools
* Lombok

### Executing program

* To the run please enter your ${API-KEY}
* The postgreSql password = ${PASSWORD]
* In order to test you can use H2 database, which is also added to the dependencies. 
