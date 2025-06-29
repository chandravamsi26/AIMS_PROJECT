// Spring Boot Application class
package com.example.aims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);

        // 👇 Print the host URL to terminal
        System.out.println("\n======================================");
        System.out.println("✅ AIMS Health Survey is running at:");
        System.out.println("🔗 http://localhost:8080");
        System.out.println("======================================\n");
    }
}
