package com.example.Book_My_Show_Backend.Models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="shows")
public class ShowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;

    private LocalTime showTime;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    // One movie can have multiple shows
    // So, movie entity is parent and showEntity is child
    @ManyToOne
    @JoinColumn
    private MovieEntity movie;

    // One theater can have multiple shows
    // Theater -> Show
    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;


    // Btn Show and Show Seat Entity
    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfSeats;


    // btn show entity and ticket entity
    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<TicketEntity> listOfTickets;
}
