package com.epam.spring.core;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName) {
        super(fileName);
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void init() throws IOException {
        setFile(new File(getFileName()));
    }

    private void writeEventsFromCache() {
        for (Event event : cache) {
            super.logEvent(event);
        }
    }

    public void destroy(){
        if(!cache.isEmpty()){
            writeEventsFromCache();
        }
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public List<Event> getCache() {
        return cache;
    }

    public void setCache(List<Event> cache) {
        this.cache = cache;
    }
}
