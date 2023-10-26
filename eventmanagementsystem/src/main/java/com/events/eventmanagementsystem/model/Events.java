package com.events.eventmanagementsystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Events {
    @Id
    private Integer eventId;
    private String eventName;
    private String eventDetails;
    private String date;
    private Integer ticketPrice;
}
