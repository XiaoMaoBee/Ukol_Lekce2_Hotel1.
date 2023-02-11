package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    boolean isVacation;
    boolean isWorkStay;
    LocalDate startDay;
    LocalDate endDay;
    int numOfGuests;
    Guest guest;



    public Booking(Guest guest, boolean isVacation,boolean isWorkStay
            ,LocalDate startDay,LocalDate endDay, int numOfGuests) {

        this.isVacation = isVacation;
        this.isWorkStay = isWorkStay;
        this.startDay = startDay;
        this.endDay = endDay;
        this.numOfGuests = numOfGuests;
        this.guest = guest;


    }
    List<Booking> listOfBookings = new ArrayList<>();

    public void getListOfAllBookings() {
        for(Booking list : listOfBookings) {
            System.out.println(
                "Name: "
                + list.guest.getName()
                + " "
                + list.guest.getSurname() + ", is vacation: "
                + list.isVacation() + ", is workstay: "
                + list.isWorkStay() + ", start date is: "
                + list.getStartDay() + ", end date is: "
                + list.getEndDay());
        }


    }


    ///region get/set

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }

    public boolean isWorkStay() {
        return isWorkStay;
    }

    public void setWorkStay(boolean workStay) {
        isWorkStay = workStay;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    public List<Booking> getListOfBookings() {
        return listOfBookings;
    }

    public void setListOfBookings(List<Booking> listOfBookings) {
        this.listOfBookings = listOfBookings;
    }


    ///endregion

}
