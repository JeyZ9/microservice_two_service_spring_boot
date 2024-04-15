package com.example.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GatewayApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testUserServiceRoute() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/user-service/test", String.class);
        assertEquals(200, response.getStatusCodeValue());
        // Add more assertions as needed
    }

    @Test
    public void testAuthenticationServiceRoute() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/authentication-service/test", String.class);
        assertEquals(200, response.getStatusCodeValue());
        // Add more assertions as needed
    }
}
