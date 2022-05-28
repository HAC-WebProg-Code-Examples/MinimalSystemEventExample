package com.example.minimalsystemeventexample;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class MyListeners {

    @EventListener
    public void contextRefreshedListener(ContextRefreshedEvent event) {
        System.out.println("Context was refreshed.");
    }

    @EventListener
    public void requestHandledListener(RequestHandledEvent event) {
        System.out.println("Request was handled.");
    }
}
