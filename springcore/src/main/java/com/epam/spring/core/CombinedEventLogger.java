package com.epam.spring.core;

import java.io.IOException;
import java.util.Map;

public class CombinedEventLogger implements EventLogger {

    private Map<EventType, EventLogger> loggers;

    public CombinedEventLogger(Map<EventType, EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        EventLogger logger = loggers.get(event.getEventType());
        if(logger == null){
            logger = loggers.get(EventType.ERROR);
        }
        logger.logEvent(event);
    }



    public Map<EventType, EventLogger> getLoggers() {
        return loggers;
    }

    public void setLoggers(Map<EventType, EventLogger> loggers) {
        this.loggers = loggers;
    }

    private void init() throws IOException {
        System.out.println("Stub init");
    }
}
