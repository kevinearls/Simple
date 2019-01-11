package com.kevinearls.Simple;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kearls on 2/8/16.
 */
public class SimpleTest {
    Random random = new Random();

    @Disabled
    @Test
    public void simpleTest() throws Exception {
        int selection = random.nextInt(5) + 1;
        assertEquals(666, selection);
    }

    @Test
    public void justPassThisTest() throws Exception {
        Thread.sleep(5000);
    }

    @Test
    public void emptyTest() {

    }
}
