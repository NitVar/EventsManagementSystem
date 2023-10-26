package com.events.eventmanagementsystem.controller;

import com.events.eventmanagementsystem.model.Events;
import com.events.eventmanagementsystem.service.EventsService;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventsController {
    @Autowired
    private EventsService eventsService;

    @GetMapping("/")
    public List<Events> getAllEvents()
    {
        return eventsService.getAllEvents();
    }

    @PostMapping("/add")
    public void addEvent(@RequestBody Events event)
    {
        eventsService.addEvent(event);
    }

    @PutMapping("/update/{eventId}")
    public void updateEvent(@PathVariable int eventId, @RequestBody Events event)
    {
        eventsService.updateEvent(eventId, event);
    }

    @DeleteMapping("delete/{eventId}")
    public void deleteEvent(@PathVariable int eventId)
    {
        eventsService.deleteEvent(eventId);
    }

@GetMapping("/{eventId}")
public Events getEvent(@PathVariable Integer eventId)
{
    return eventsService.getEventById(eventId);
}
}
