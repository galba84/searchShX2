package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    Calc testInstance = new Calc();
    int testValue = -4;

    @Test
    void testShReturnCorrectValue() {
        double result = testInstance.findShA(testValue);
        double roundedResult = Math.round(result * 10) / 10.0d;
        double referenceResult = Math.sinh(testValue);
        double roundedReferenceResult = Math.round(referenceResult * 10) / 10.0d;
        assertEquals(roundedResult, roundedReferenceResult);
    }

    @Test
    void testShResultDiffersInLessThanThirdElement() {
        double result = testInstance.findShA(testValue);
        double referenceResult = Math.sinh(testValue);
        double difference = result - referenceResult;
        assert (difference < 0.1);
    }

    @Test
    void testShResultDiffersFromReferentResult() {
        double result = testInstance.findShA(testValue);
        double referenceResult = Math.sinh(testValue);
        assert (result != referenceResult);
    }
}