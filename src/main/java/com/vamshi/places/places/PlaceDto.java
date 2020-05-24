package com.vamshi.places.places;

import org.json.JSONObject;
import se.walkercrou.places.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PlaceDto {


    private final List<Photo> photos = new ArrayList();
    private final List<Review> reviews = new ArrayList();
    private final List<AddressComponent> addressComponents = new ArrayList();

    private GooglePlaces client;
    private String placeId;

    private double lat = -1.0D;
    private double lng = -1.0D;

    private String name;
    private String addr;

    private double rating = -1.0D;
    private Status status;

    private String phone;

    private String googleUrl;
    private String website;

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<AddressComponent> getAddressComponents() {
        return addressComponents;
    }

    public GooglePlaces getClient() {
        return client;
    }

    public void setClient(GooglePlaces client) {
        this.client = client;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGoogleUrl() {
        return googleUrl;
    }

    public void setGoogleUrl(String googleUrl) {
        this.googleUrl = googleUrl;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
