package dev.funixgaming.spring.core.tools.string;

import dev.funixgaming.spring.core.exceptions.ApiException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class StringUtilsTest {

    @Test
    void testReadSuccess() {
        final String fileContent = StringUtils.readFromClasspath("test.txt", StringUtilsTest.class);
        assertEquals("This Tesssst has been done !", fileContent);
    }

    @Test
    void testReadNoFile() {
        assertThrowsExactly(ApiException.class, () -> StringUtils.readFromClasspath("test2.txt", StringUtilsTest.class));
    }

}
