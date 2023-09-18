package com.demoqa.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkipedTests {

    @Test
    @Disabled
    void name() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void name2() {
        assertTrue(false);
    }

}
