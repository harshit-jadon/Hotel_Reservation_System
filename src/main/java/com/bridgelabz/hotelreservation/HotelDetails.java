package com.bridgelabz.hotelreservation;

public class HotelDetails<E> {
    E hotelName,  hotelWeekDayRate,  hotelWeekEndRate;

    public HotelDetails(E hotelName, E hotelWeekDayRate,E hotelWeekEndRate) {
        this.hotelName = hotelName;
        this.hotelWeekDayRate = hotelWeekDayRate;
        this.hotelWeekEndRate = hotelWeekEndRate;
    }

    public E getHotelName() {
        return hotelName;
    }

    public void setHotelName(E hotelName) {
        this.hotelName = hotelName;
    }

    public E getHotelWeekDayRate() {
        return hotelWeekDayRate;
    }

    public void setHotelWeekDayRate(E hotelWeekDayRate) {
        this.hotelWeekDayRate = hotelWeekDayRate;
    }

    public E getHotelWeekEndRate() {
        return hotelWeekEndRate;
    }

    public void setHotelWeekEndRate(E hotelWeekEndRate) {
        this.hotelWeekEndRate = hotelWeekEndRate;
    }

}
