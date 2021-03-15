package com.pedsf.codewars;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class UserTest {

    @Test
    public void GivenUserProgress_WhenProgressSumLessThen100_ThenSumProgress() {
        User user = new User();
        user.setProgress(20);
        user.setRank(-4);
        int oldRank = user.getRank();
        user.incProgress(30);

        assertThat(50).isEqualTo(user.getProgress());
        assertThat(oldRank).isEqualTo(user.getRank());
    }

    @Test
    public void GivenUserProgress_WhenProgressGreaterThen100_ThenSumProgressAndIncreaseRank() {
        User user = new User();
        user.setProgress(80);
        user.setRank(-4);
        user.incProgress(30);

        assertThat(10).isEqualTo(user.getProgress());
        assertThat(-3).isEqualTo(user.getRank());
    }


}