package org.example.ex42;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        org.example.ex42.App test = new App();
        assertEquals("success", test.fileSuccess());
    }
}