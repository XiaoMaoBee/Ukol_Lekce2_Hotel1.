package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingList {


    List<Booking> listOfBookings = new ArrayList<>();

    public List<Booking> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(List<Booking> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }
    public void printListOfAllBookings() {
        System.out.println("LIST OF ALL BOOKINGS: ");
        for(Booking booking : listOfBookings) {
            System.out.println(
                    "Name: "
                            + booking.getName()
                            + " "
                            + booking.getSurname() + ", is vacation: "
                            + booking.isVacation() + ", is workstay: "
                            + booking.isWorkStay() + ", start date is: "
                            + booking.getStartDay() + ", end date is: "
                            + booking.getEndDay() + ", num. of guests: "
                            + booking.getNumOfGuests());

            System.out.println(booking);
        }
    }
}
