package com.qa.test.degrees;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.main.degrees.TemperatureConverter;

public class TemperatureConverterTest {

    private static TemperatureConverter tc;

    @BeforeClass
    public static void setup() {
        tc = new TemperatureConverter();
    }

    @Test
    public void shouldConvertCelsiusToFahrenheit() {
        assertEquals(32, tc.convertCelsiusToFahrenheit(0), 0);
    }

}
