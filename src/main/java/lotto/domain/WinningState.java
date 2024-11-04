package lotto.domain;

public enum WinningState {
    FIRST_PRIZE(2_000_000_000),
    SECOND_PRIZE(30_000_000),
    THIRD_PRIZE(1_500_000),
    FOURTH_PRIZE(50000),
    FIFTH_PRIZE(5000);

    private int amount;
    WinningState(int amount) {
        this.amount = amount;
    }
}
