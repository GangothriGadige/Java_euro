package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class EuroTest {
    @Test
    public void shouldCheckEqualityWhenTenEuroIsComparedWithTenEuro() {
        Euro firstEuro = new Euro(10);
        Euro secondEuro = new Euro(10);

        assertThat(firstEuro, equalTo(secondEuro));
    }

    @Test
    public void shouldCheckEqualityWhenTenEuroIsComparedWithTwentyEuro() {
        Euro firstEuro = new Euro(10);
        Euro secondEuro = new Euro(20);

        assertThat(firstEuro, not(equalTo(secondEuro)));
    }

    @Test
    public void shouldReturnEuroSumWhenTwoEuroAreAdded() {
        Euro fiveEuro = new Euro(5);
        Euro twoEuro = new Euro(2);
        Euro result = new Euro(7);

        Euro actual = fiveEuro.plus(twoEuro);
        assertThat(actual, equalTo(result));
    }
}
