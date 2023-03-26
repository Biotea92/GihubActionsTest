package com.example.ci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CiTest {

    @Test
    void test() {
        Assertions.assertThat("CI SUCCESS").isEqualTo("CI SUCCESS");
    }
}
