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
        List<Place> places=client.getPlacesByQuery("Empire State Building",GooglePlaces.MAXIMUM_RESULTS);
        System.out.println(places[0]);
    }
}
