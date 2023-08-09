package com.example.bookmyshow.Models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String alloted_seats;

    private int amount;

    private Date booked_at;

    //Here you will connect
    @ManyToOne
    @JoinColumn
    private UserEntity user; //

    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> bookedSeats;

    public void setBookedSeats(List<ShowSeatEntity> bookedSeats) {
    }

    public void setAlloted_seats(String allotedSeats) {
    }

    public void setUser(UserEntity userEntity) {
    }

    public void setBooked_at(Date date) {
    }

    public void setAmount(int totalAmout) {
    }

    public void setShow(ShowEntity showEntity) {
    }
}
