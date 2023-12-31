package com.example.Book_My_Show_Backend.Models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theater")
@Data
@NoArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String city;

    private String address;


    // Theater Entity is the parent class of TheaterSeatEntity
    // So, it consist list of theaterSeats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeatEntity> theaterSeatEntityList;

    // Theater --> Show (List of shows)
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;

}
