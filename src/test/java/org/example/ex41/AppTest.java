package org.example.ex41;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    //Junit5 Test for ex41
    @Test
    void main() {
        App test = new App();
        assertEquals("File Created.", test.fileSuccess());

    }
}