package org.skypro.examiner.generator;

import org.springframework.stereotype.Component;

@Component
public class RandomIndex {
    public int getRandomGenerator(int maxValue) {
        java.util.Random random = new java.util.Random();
        int minValue = 0;
        return random.nextInt(maxValue);
    }
}
