package org.bedu.postwork.javase2project.tools;

import lombok.experimental.UtilityClass;

import java.util.*;

@UtilityClass
public class MergeSortAlgorithm {

    public static <T extends Comparable<T>> List<T> sort(List<T> unsortedList) {
        return sort(unsortedList, Comparator.naturalOrder());
    }

    public static <T> List<T> sort(List<T> unsortedList, Comparator<T> comparator) {
        if (unsortedList.size() == 1) {
            return unsortedList;
        }

        int middleElement = unsortedList.size() / 2;

        Deque<T> stackA = new ArrayDeque<>(sort(unsortedList.subList(0, middleElement), comparator));
        Deque<T> stackB = new ArrayDeque<>(sort(unsortedList.subList(middleElement, unsortedList.size()), comparator));

        return merge(stackA, stackB, comparator);

    }

    private static <T> List<T> merge(Deque<T> stackA, Deque<T> stackB, Comparator<T> comparator) {
        List<T> merged = new ArrayList<>();

        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            if (comparator.compare(stackA.peekFirst(), stackB.peekFirst()) < 0) {
                merged.add(stackA.pop());
            } else {
                merged.add(stackB.pop());
            }
        }

        merged.addAll(stackA);
        merged.addAll(stackB);

        return merged;

    }

}
