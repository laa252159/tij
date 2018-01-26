package com.insightfullogic.java8.exercises.chapter4;

import static java.util.stream.Stream.concat;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.stream.Stream;

/** A Performance by some musicians - e.g., an Album or Gig. */
public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    default Stream<Artist> getAllMusicians(){
        return getMusicians().flatMap(artist -> {
            return concat(Stream.of(artist), artist.getMembers());
        });
    }

}