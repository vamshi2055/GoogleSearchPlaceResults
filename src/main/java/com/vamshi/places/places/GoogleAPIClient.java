package com.vamshi.places.places;

import com.google.maps.GeoApiContext;
import com.google.maps.PlaceDetailsRequest;
import com.google.maps.TextSearchRequest;
import com.google.maps.errors.ApiException;
import com.google.maps.model.PlaceDetails;
import com.google.maps.model.PlaceType;
import com.google.maps.model.PlacesSearchResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GoogleAPIClient {


    private GeoApiContext initialize() {
        GeoApiContext apiContext = new GeoApiContext.Builder()
                .apiKey("AIzaSyCl1Xov4uSqddt7yj0E1RFungeFp_3I_5k")
                .build();
        return apiContext;
    }

    public PlaceDetails getPlaceDetails(String placeId) throws InterruptedException, ApiException, IOException {


        GeoApiContext geoApiContext = initialize();
        PlaceDetailsRequest placeDetailsRequest = new PlaceDetailsRequest(geoApiContext);
        placeDetailsRequest.placeId(placeId);
        placeDetailsRequest.fields(PlaceDetailsRequest.FieldMask.REVIEW, PlaceDetailsRequest.FieldMask.ADR_ADDRESS, PlaceDetailsRequest.FieldMask.ADDRESS_COMPONENT, PlaceDetailsRequest.FieldMask.FORMATTED_PHONE_NUMBER,
                PlaceDetailsRequest.FieldMask.NAME,
                PlaceDetailsRequest.FieldMask.PHOTOS);
        placeDetailsRequest.region("US");

        PlaceDetails place = placeDetailsRequest.await();

        System.out.println("Place" + place.toString());
        return place;
    }

    public PlacesSearchResponse getPlaceDetailsByQuery(String searchQuery) throws InterruptedException, ApiException, IOException {
        GeoApiContext geoApiContext = initialize();
        TextSearchRequest textSearchRequest = new TextSearchRequest(geoApiContext);
        textSearchRequest.query(searchQuery);
        textSearchRequest.region("US");
        textSearchRequest.type(PlaceType.LAUNDRY);

        PlacesSearchResponse response = textSearchRequest.await();
        return response;
    }
}
