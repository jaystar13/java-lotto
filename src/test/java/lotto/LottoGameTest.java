package lotto;

import lotto.domain.HitResult;
import lotto.domain.LottoGame;
import lotto.domain.Numbers;
import lotto.domain.WinNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LottoGameTest {
    @DisplayName("당첨 번호 숫자와 로또 게임 숫자를 비교하여 맞은 갯수를 반환한다.")
    @Test
    public void count() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 19, 29, 33);
        List<Integer> winNumbers = Arrays.asList(1, 3, 5, 19, 29, 45);
        int bonusNumber = 41;

        LottoGame lottoGame = new LottoGame(new Numbers(numbers));
        HitResult hitResult = lottoGame.match(new WinNumbers(winNumbers, bonusNumber));

        assertThat(hitResult.getPrizeHitCount()).isEqualTo(5);
    }

    @DisplayName("당첨 번호 숫자와 로또 게임 숫자를 비교하여 당첨 금액을 반환한다.")
    @Test
    public void money() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 19, 29, 33);
        List<Integer> winNumbers = Arrays.asList(1, 3, 5, 19, 29, 45);
        int bonusNumber = 41;

        LottoGame lottoGame = new LottoGame(new Numbers(numbers));
        HitResult hitResult = lottoGame.match(new WinNumbers(winNumbers, bonusNumber));

        assertThat(hitResult.getPrizeMoney()).isEqualTo(1_500_000);
    }
}
