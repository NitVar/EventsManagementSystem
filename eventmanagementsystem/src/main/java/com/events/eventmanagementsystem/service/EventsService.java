package com.events.eventmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.events.eventmanagementsystem.model.Events;
import com.events.eventmanagementsystem.repository.EventsRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventsService {
    @Autowired
    private EventsRepository eventsRepository;
    public List<Events> getAllEvents() {
        List<Events> lst = new ArrayList<>();
        eventsRepository.findAll()
                .forEach(lst::add);
        return lst;
    }

    public void addEvent(Events event) {
        eventsRepository.save(event);
    }

    public void updateEvent(int eventId, Events event) {
        eventsRepository.save(event);
    }

    public void deleteEvent(int eventId) {
        eventsRepository.deleteById(eventId);
    }

    public Events getEventById(Integer id) {
        java.util.Optional<Events> ee =  eventsRepository.findById(id);
        Events e = ee.get();
        return e;
    }
}
