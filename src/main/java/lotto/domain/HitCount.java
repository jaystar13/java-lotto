package lotto.domain;

import java.util.Objects;

public class HitCount {
    private final int hitCount;

    public HitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HitCount hitCount1 = (HitCount) o;
        return hitCount == hitCount1.hitCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hitCount);
    }

    @Override
    public String toString() {
        return Integer.toString(hitCount);
    }
}
