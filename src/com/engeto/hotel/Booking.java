package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {
    private boolean isVacation;
    private boolean isWorkStay;
    private LocalDate startDay;
    private LocalDate endDay;
    private int numOfGuests;
    private String name;
    private String surname;


    public Booking(String name ,String surname, boolean isVacation,boolean isWorkStay
            ,LocalDate startDay,LocalDate endDay, int numOfGuests) {

        this.isVacation = isVacation;
        this.isWorkStay = isWorkStay;
        this.startDay = startDay;
        this.endDay = endDay;
        this.numOfGuests = numOfGuests;
        this.name = name;
        this.surname = surname;



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }




    ///endregion

}
