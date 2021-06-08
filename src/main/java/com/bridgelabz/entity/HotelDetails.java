package com.bridgelabz.entity;

public class HotelDetails<E> {
    E hotelName, hotelPrice, hotelRating;

    public HotelDetails(E hotelName, E hotelPrice, E hotelRating) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
        this.hotelRating = hotelRating;
    }

    public E getHotelName() {
        return hotelName;
    }

    public void setHotelName(E hotelName) {
        this.hotelName = hotelName;
    }

    public E getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(E hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public E getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(E hotelRating) {
        this.hotelRating = hotelRating;
    }
}
