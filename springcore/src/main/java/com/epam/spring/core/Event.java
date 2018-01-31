package com.epam.spring.core;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {

    public Event(Date date, DateFormat df, String msg, EventType eventType) {
        this.date = date;
        this.df = df;
    }

    static Random random = new Random();

    private int id;
    private String msg;
    private Date date;
    private DateFormat df;
    private EventType eventType;

    @Override
    public String toString() {
        return id + " : " + date + " : " + msg + " : " + eventType;
    }

    public int getId() {
        return random.nextInt(10000);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
