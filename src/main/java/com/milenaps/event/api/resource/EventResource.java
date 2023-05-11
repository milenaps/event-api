package com.milenaps.event.api.resource;

import com.milenaps.event.api.model.Event;
import com.milenaps.event.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventResource {

    @Autowired
    private EventService service;

    @GetMapping("/events")
    public List<Event> listEvents() {
        return service.listEvents();
    }

    @GetMapping("/events/{id}")
    public Optional<Event> findEventById(@PathVariable String id) {
        return service.findEventById(id);
    }
}
