package com.duoc.back_libros;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = BackLibrosApplication.class)
@ActiveProfiles("test")
class BackLibrosApplicationTests {

    @Test
    void contextLoads() {
        // This method will just check if the application context loads
    }
}