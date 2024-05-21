package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LCOMCalculatorTest {
    @Test
    public void testAddMethod() {
        LCOMCalculator.ClassInfo classInfo = new LCOMCalculator.ClassInfo();
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr2")));

        assertEquals(2, classInfo.methods.size());
        assertTrue(classInfo.methodAttributes.containsKey("method1"));
        assertTrue(classInfo.methodAttributes.containsKey("method2"));
        assertTrue(classInfo.methodAttributes.get("method1").contains("attr1"));
        assertTrue(classInfo.methodAttributes.get("method1").contains("attr2"));
        assertTrue(classInfo.methodAttributes.get("method2").contains("attr2"));
    }
}
