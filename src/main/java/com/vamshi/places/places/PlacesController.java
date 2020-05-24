package com.vamshi.places.places;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.maps.errors.ApiException;
import com.google.maps.model.PlaceDetails;
import com.google.maps.model.PlacesSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@JsonIgnoreProperties(ignoreUnknown=true)
public class PlacesController {


    @Autowired
    GoogleAPIClient googleAPIClient;

    @PostMapping(value = "/places")
    public PlacesSearchResponse getPlaces(@RequestParam String searchQuery) throws InterruptedException, ApiException, IOException {
        PlacesSearchResponse places=googleAPIClient.getPlaceDetailsByQuery(searchQuery);
        return places;
    }

    @PostMapping(value = "/placeDetails")
    public PlaceDetails getPlaceDetails(@RequestParam String placeId) throws InterruptedException, ApiException, IOException {
       //PlaceDto place=services.getPlaceDetails(placeId);
        PlaceDetails place=googleAPIClient.getPlaceDetails(placeId);
        System.out.println(place.toString());
        return place;
    }
}