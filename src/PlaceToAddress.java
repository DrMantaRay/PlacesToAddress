
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
<<<<<<< HEAD

=======
>>>>>>> origin/master
import se.walkercrou.places.GooglePlaces;
import se.walkercrou.places.Param;
import se.walkercrou.places.Place;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
/**
 * Created by pchen on 1/30/2017.
 */
public class PlaceToAddress {
<<<<<<< HEAD
    private String apiKey="";
    public String getApiKey(){return apiKey;}
=======
>>>>>>> origin/master
    private List<String[]> inFile;
    private void loadCsv(String filename){
        try {
            CSVReader reader = new CSVReader(new FileReader(filename));
            try {
                inFile = reader.readAll();
            }catch(IOException e) {
                e.printStackTrace();
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
    private void exportCsv(String filename) {
        try {
            CSVWriter writer= new CSVWriter(new FileWriter(filename), ',');
            writer.writeAll(inFile);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
<<<<<<< HEAD
        GooglePlaces client= new GooglePlaces(new PlaceToAddress().getApiKey());
=======
        GooglePlaces client= new GooglePlaces("AIzaSyDL1IpxsgU4d2u5VRHSPxognEhqcm-0ah4");
>>>>>>> origin/master
        PlaceToAddress placelist = new PlaceToAddress();
        placelist.loadCsv("/home/patrick/PlacesToAddress/src/FacilityContacts.csv");

        for (String[] stringlists : placelist.inFile.subList(1, placelist.inFile.size())) {
            if (!stringlists[2].equals("")) {
                try {
                    System.out.println(stringlists[2]);
                    List<Place> places = client.getPlacesByQuery( "Idaho" + stringlists[2], GooglePlaces.DEFAULT_RESULTS, Param.name("gl").value("US"),Param.name("location").value("ID"));
                    stringlists[6] = places.get(0).getAddress();
                    System.out.println(stringlists[6]);
                } catch(Exception e ) {
                    e.printStackTrace();
                    stringlists[6] = "Address Not Found";
                }
            }
        }
        placelist.exportCsv("/home/patrick/PlacesToAddress/src/FacilityContactsWithAddress.csv");

    }
}
