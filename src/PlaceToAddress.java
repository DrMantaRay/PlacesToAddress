import se.walkercrou.places.GooglePlaces;
import se.walkercrou.places.Place;
import java.io.*;

import java.util.List;

/**
 * Created by pchen on 1/30/2017.
 */
public class PlaceToAddress {
    public static void main(String[] args) {
        GooglePlaces client= new GooglePlaces("AIzaSyDeziui3HYOmTYeYAuZ3uULCqjLd1afk-E");
        List<Place> places = client.getPlacesByQuery("library", GooglePlaces.MAXIMUM_RESULTS);
        int i=0;
        for (Place place : places) {
            System.out.println(place.getName());
            i++;
            if (i>20) {break;}
          /*  if (place.getName().equals("Empire State Building")) {
                empireStateBuilding = place;
                break;
            } */

        }
/*
        if (empireStateBuilding != null) {
            Place detailedEmpireStateBuilding = empireStateBuilding.getDetails(); // sends a GET request for more details
            // Just an example of the amount of information at your disposal:
           // System.out.println("ID: " + detailedEmpireStateBuilding.getId());
            System.out.println("Name: " + detailedEmpireStateBuilding.getName());
            System.out.println("Phone: " + detailedEmpireStateBuilding.getPhoneNumber());
            System.out.println("International Phone: " + empireStateBuilding.getInternationalPhoneNumber());
            System.out.println("Website: " + detailedEmpireStateBuilding.getWebsite());
            System.out.println("Always Opened: " + detailedEmpireStateBuilding.isAlwaysOpened());
            System.out.println("Status: " + detailedEmpireStateBuilding.getStatus());
            System.out.println("Google Place URL: " + detailedEmpireStateBuilding.getGoogleUrl());
            System.out.println("Price: " + detailedEmpireStateBuilding.getPrice());
            System.out.println("Address: " + detailedEmpireStateBuilding.getAddress());
            System.out.println("Vicinity: " + detailedEmpireStateBuilding.getVicinity());
            System.out.println("Reviews: " + detailedEmpireStateBuilding.getReviews().size());
            System.out.println("Hours:\n " + detailedEmpireStateBuilding.getHours());
        } */
    }
}
