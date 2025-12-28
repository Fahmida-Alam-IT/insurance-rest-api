package com.insurance;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * Basic Spring Boot test to ensure the ApplicationContext loads correctly.
 */
@SpringBootTest
@TestPropertySource(properties = {
        // In-memory H2 database for testing
        "spring.datasource.url=jdbc:h2:mem:testdb",
        "spring.datasource.driverClassName=org.h2.Driver",
        "spring.datasource.username=root",
        "spring.datasource.password=NewStrongPassword!",
        // Optional: Disable JPA DDL auto for tests if not needed
        "spring.jpa.hibernate.ddl-auto=update"
})
public class AppTest {

    @Test
    void contextLoads() {
        // This test will pass if the Spring ApplicationContext loads successfully
    }
}
