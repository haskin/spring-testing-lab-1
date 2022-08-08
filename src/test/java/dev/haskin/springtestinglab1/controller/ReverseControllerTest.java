package dev.haskin.springtestinglab1.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Problem

x Create unit tests to make sure your method works with
    x uppercase,
    x lowercase,
    x mixed case,
    x spaces and
    x words with numbers in them
x Remove the endpoint mapping from your endpoint
x Ensure that your unit tests still pass

 */

class ReverseControllerTest {

    ReverseController reverseController;

    private static Stream<Arguments> getWordTestCases() {
        return Stream.of(
                Arguments.of("REPPU", "UPPER"),
                Arguments.of("rewol", "lower"),
                Arguments.of("mIxeD", "DexIm"),
                Arguments.of("   s p a c  es ", " se  c a p s   "),
                Arguments.of("numb3rw0rd", "dr0wr3bmun")
        );
    }

    @BeforeEach
    void setup() {
        reverseController = new ReverseController();
    }

    @ParameterizedTest
//    @ValueSource(strings = {"UPPER, lower"})
    @MethodSource("getWordTestCases")
    void allTypesOfStringTest(String expected, String word) {
        assertEquals(expected, reverseController.reverseString(word));
    }

//    @Test
//    void reverseString_uppercase() {
//        String uppercase = "UPPER";
//        String expected = "REPPU";
//        assertEquals(expected, reverseController.reverseString(uppercase));
//    }
//
//    @Test
//    void reverseString_lowercase() {
//        String lower = "lower";
//        String expected = "rewol";
//        assertEquals(expected, reverseController.reverseString(lower));
//}


}