package com.insightfullogic.java8.exercises.chapter3.hw;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

public class Task1a {
    public static void main(String[] args) {
        System.out.println("abCdeF".chars().filter(ch -> Character.isLowerCase(ch)).count());

        List<String> strs = Arrays.asList("ABCaaa", "DaaEF", "KLaM");
        Optional<String> minStr = strs.stream().max(Comparator.comparing(str -> str.replaceAll("\\W", "").length()));
        System.out.println(minStr.get());


    }

    public static Integer addUp(Stream<Integer> nums) {
        return nums.reduce(0, (acc, x) -> acc + x);
    }

    public static List<Album> getNamesAndOriginsMy(List<Album> src) {
        return src.stream()
                .filter(album -> album.getTrackList().size() < 3)
                .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
                .filter(album -> album.getTrackList().size() <= 3)
                .collect(toList());
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                .flatMap(a -> Stream.of(a.getName(), a.getNationality()))
                .collect(toList());
    }

    public static Long sumUpMembers(List<Artist> artists) {
        return artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }

    public static int countBandMembersInternal(List<Artist> artists) {
        // NB: readers haven't learnt about primitives yet, so can't use the sum() method
//        return artists.stream()
//                .map(artist -> artist.getMembers().count())
//                .reduce(0L, Long::sum)
//                .intValue();

        return (int) artists.stream()
                .flatMap(artist -> artist.getMembers())
                .count();
    }

}
