package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {
    public static final int CREATION_MAX_COUNT = 6;
    public static final int CREATION_NUMBER_BOUND = 45;

    public static Numbers creation() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= CREATION_NUMBER_BOUND; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        numbers = reduce(numbers);
        Collections.sort(numbers);

        return new Numbers(numbers);
    }

    private static List<Integer> reduce(List<Integer> numbers) {
        List<Integer> reduce = new ArrayList<>();
        for (int i = 0; i < CREATION_MAX_COUNT; i++) {
            reduce.add(numbers.get(i));
        }
        return reduce;
    }
}
