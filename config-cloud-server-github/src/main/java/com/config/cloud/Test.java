package com.config.cloud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("nayan", 1);
        //map.forEach((key, value) -> System.out.println(key + " " + value));

        Stream<String> one = Stream.of("one", "two", "three");
        int reduce = one.mapToInt(String::length).reduce(0, (l1, l2) -> l1 + l2);
        //System.out.println(reduce);

        Stream<String> lines = Files.lines(Paths.get("C:/Users/nayan/Desktop/records.txt"));
        lines.map(data -> data.split("-")[0].trim())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key+" "+value));


    }
}
