package org.bedu.postwork.javase2project.tools;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortAlgorithmTest {

    private static final Random RANDON_GENERATOR = new Random();
    private static final int COLLECTION_SIZE = 100000;

    private List<Integer> unsorted;

    @RequiredArgsConstructor
    @Data
    class Custom {
        private final int value;
    }

    @BeforeEach
    void setup() {
        unsorted = IntStream.rangeClosed(0, COLLECTION_SIZE)
                .mapToObj(i -> RANDON_GENERATOR.nextInt())
                .collect(Collectors.toList());
    }

    @Test
    @DisplayName("Ordena una colección de enteros")
    void sortsIntegerCollection() {
        List<Integer> sorted = MergeSortAlgorithm.sort(unsorted);

        assertThat(sorted.size()).isEqualTo(unsorted.size());

        IntStream.range(1, sorted.size())
                .forEach(idx -> assertThat(sorted.get(idx - 1)).isLessThanOrEqualTo(sorted.get(idx)));
    }

    @Test
    @DisplayName("Ordena una colección con un comparador")
    void sortsCollectionWithComparable() {

        List<Custom> customUnsorted = unsorted.stream()
                .map(Custom::new)
                .collect(Collectors.toList());

        List<Custom> sorted = MergeSortAlgorithm.sort(customUnsorted, Comparator.comparingInt(Custom::getValue));

        assertThat(sorted.size()).isEqualTo(customUnsorted.size());

        IntStream.range(1, sorted.size())
                .forEach(idx -> assertThat(sorted.get(idx - 1).getValue()).isLessThanOrEqualTo(sorted.get(idx).getValue()));
    }
}