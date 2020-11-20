package lotto.domain;

import java.util.Set;

@FunctionalInterface
public interface LottoGenerator {
    Set<LottoNumber> create();
}