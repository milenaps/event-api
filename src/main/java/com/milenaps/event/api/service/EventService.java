package com.milenaps.event.api.service;

import com.milenaps.event.api.model.Event;
import com.milenaps.event.api.model.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public List<Event> listEvents() {
        return repository.findAll();
    }

    public Optional<Event> findEventById(final String id) {
        return repository.findById(id);
    }

    public Optional<Event> findEventByName(final String name) {
        return repository.findByName(name);
    }

    public Event createUpdateEvent(final Event event) {
        return repository.save(event);
    }

    public void deleteEventById(final String id) {
        repository.deleteById(id);
    }

    public void deleteEvent(final Event event) {
        repository.delete(event);
    }
}
