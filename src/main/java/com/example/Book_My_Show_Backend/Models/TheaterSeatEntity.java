package com.example.Book_My_Show_Backend.Models;


import com.example.Book_My_Show_Backend.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater_seats")
@Data
@NoArgsConstructor
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(columnDefinition = "seat_no", nullable = false)
    String seatNo;

    @Enumerated(value =EnumType.STRING )
    SeatType seatType;

    private int rate;


    // TheaterSeatEntity is child class for Theater Entity
    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;



}
