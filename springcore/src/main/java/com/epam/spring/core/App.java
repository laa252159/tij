package com.epam.spring.core;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private Client client;
    private EventLogger eventLogger;


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Event event = ctx.getBean(Event.class);
        event.setEventType(EventType.ERROR);
        ctx.getBean(CombinedEventLogger.class).logEvent(event);

        event.setEventType(EventType.INFO);
        ctx.getBean(CombinedEventLogger.class).logEvent(event);

        ctx.getBean(CombinedEventLogger.class).logEvent(event);

        System.out.println(ctx.getBean(Client.class));

//        System.out.println(ctx.getBean(Client.class).getGreeting());
//        app.logEvent("Some event for 1");
//        app.logEvent("Some event for 2");
        ctx.close();


//        App app = new App();
//        app.client = new Client("1", "John Smith");
//        app.consoleEventLogger = new ConsoleEventLogger();

//        app.logEvent("Some event for user 1");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public EventLogger getEventLogger() {
        return eventLogger;
    }

    public void setEventLogger(CacheFileEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }
}
