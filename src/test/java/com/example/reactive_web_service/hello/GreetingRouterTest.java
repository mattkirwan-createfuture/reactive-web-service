package com.example.reactive_web_service.hello;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


public class GreetingRouterTest {
    // Spring creates a WebTestClient already configured and ready to issue requests on RANDOM_PORT
    @Autowired
    private WebTestClient webTestClient;



}
