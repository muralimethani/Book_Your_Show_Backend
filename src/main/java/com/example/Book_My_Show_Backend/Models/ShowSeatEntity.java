package com.example.Book_My_Show_Backend.Models;


import com.example.Book_My_Show_Backend.Enums.SeatType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="show_seats")
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Boolean booked;

    private Date bookedAt;


    // Show --> ShowEntity
    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    //  which seats alloted to which ticket
    // ticket --> show seat (one to many)
    @ManyToOne
    @JoinColumn
    private TicketEntity ticket;
}
