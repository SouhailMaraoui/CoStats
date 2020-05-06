package com.aseds.costats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoStatsApplication.class, args);
	}

}

@RestController
class HelloController
{
    @GetMapping("/")
    String hello()
    {
        return "CoStats Project";
    }
}
