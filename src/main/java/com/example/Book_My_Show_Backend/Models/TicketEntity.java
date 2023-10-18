package com.example.Book_My_Show_Backend.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String alloted_seats;

    private int amount;

    private Date booked_at;


    // One user can book many tickets
    @ManyToOne
    @JoinColumn
    private UserEntity user;


    // Many ticktets corresponding to one show
    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    // ticket --> shoe seat entity
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<ShowSeatEntity> bookedSeats;
}
