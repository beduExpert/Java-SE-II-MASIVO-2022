package com.example.BP.retos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortAlgorithmTest {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int ARRAY_SIZE = 100000;
    private List<Number> unsortedList;

    @BeforeEach
    void setup() {
        unsortedList = IntStream.range(0, ARRAY_SIZE).mapToObj(i -> RANDOM_GENERATOR.nextInt()).collect(Collectors.toList());
    }

    @Test
    @DisplayName("Prueba de quickSort")
    void test() {

        List<Number> sorted = QuickSortAlgorithm.sort((ArrayList<Number>) unsortedList);

        assertThat(sorted.size()).isEqualTo(unsortedList.size());

        IntStream.range(1, ARRAY_SIZE)
                .forEach(idx -> assertThat(sorted.get(idx - 1).doubleValue() <= sorted.get(idx).doubleValue()));
    }

}